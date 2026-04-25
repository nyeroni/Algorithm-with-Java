import java.util.*;
class Solution {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public int solution(String[] maps) {
        
        int a = count('S', 'L', maps);
        if(a < 0) return -1;
        int b = count('L', 'E', maps);
        if(b < 0) return -1;
        
        return a + b;
        // return 0;
        
    }
    public int count(char start, char end, String[] maps) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[maps.length][maps[0].length()];
        int x = 0, y = 0, dist = 0, nx = 0, ny = 0;
        for(int i=0; i<maps.length; i++) {
            for(int j=0; j<maps[i].length(); j++) {
                if(maps[i].charAt(j) == start) {
                    x = i;
                    y = j;
                }
            }
        }
        queue.offer(new int[]{x, y, dist});
        visited[x][y] = true;
        while(!queue.isEmpty()) {
            int[] now = queue.poll();
            x = now[0];
            y = now[1];
            dist = now[2];
            // System.out.println("x : " + x + ", y : " + y + ", dist : " + dist); 
            if(maps[x].charAt(y) == end) return dist;
            for(int i=0; i<4; i++) {
                nx = x + dx[i];
                ny = y + dy[i];
                if(nx < 0 || nx >= maps.length || ny < 0 || ny >= maps[0].length()) {
                    continue;
                }
                if(visited[nx][ny]) continue;
                if(maps[nx].charAt(ny) == 'X') continue;
                visited[nx][ny] = true;
                queue.offer(new int[]{nx, ny, dist + 1});
            }
        }
        
        return -1;
    }
}