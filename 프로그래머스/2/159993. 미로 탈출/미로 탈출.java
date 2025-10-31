import java.util.*;
class Solution {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    int []start = new int[2];
    public int solution(String[] maps) {
        int answer = 0;
        boolean[][] visited = new boolean[maps.length][maps[0].length()];
        for(int i=0; i<maps.length; i++) {
            for(int j=0; j<maps[0].length(); j++) {
                if(maps[i].charAt(j) == 'S') {
                    start[0] = i;
                    start[1] = j;
                }
            }
        }
        int a, b;
        a = bfs(start[0], start[1], 'L', maps, visited, 0);
        if(a == -1) return -1;
        // System.out.println("L : " + a);
        // System.out.println("start[0] : " + start[0] + ", start[1] : " + start[1]);
        visited = new boolean[maps.length][maps[0].length()];

        b = bfs(start[0], start[1], 'E', maps, visited, a);
        
        // System.out.println("E : " + b);
        // System.out.println("start[0] : " + start[0] + ", start[1] : " + start[1]);

        if(b == -1) return -1;
        return b;
    }
    private int bfs(int x, int y, Character c, String[] maps, boolean[][] visited, int dist) {
        Queue<int[]> queue = new LinkedList<>();  
        queue.offer(new int[]{x, y, dist});
        visited[x][y] = true;
        while(!queue.isEmpty()) {
            int[] now = queue.poll();
            x = now[0];
            y = now[1];
            dist = now[2];
            for(int i=0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx < 0 || ny < 0 || nx >= maps.length || ny >= maps[0].length()) {
                    continue;
                }
                if(!visited[nx][ny] && maps[nx].charAt(ny) == c) {
                    start[0] = nx;
                    start[1] = ny;
                    // System.out.println("start[0] : " + start[0] + ", start[1] : " + start[1]);
                    return dist + 1;
                }
                if(!visited[nx][ny] && maps[nx].charAt(ny) != 'X') {
                    visited[nx][ny] = true;
                    // System.out.println("nx : " + nx + ", ny : " + ny);
                    // System.out.println("dist : " + (dist+1));
                    queue.offer(new int[]{nx, ny, dist +1});
                }
            }
        }
        return -1;
    }
}