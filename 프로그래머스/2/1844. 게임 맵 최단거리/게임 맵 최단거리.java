import java.util.*;

class Solution {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static boolean[][] visited;
    public int solution(int[][] maps) {
        int lenX = maps.length;
        int lenY = maps[0].length;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0, 1});
        visited = new boolean[lenX][lenY];
        visited[0][0] = true;
        while(!queue.isEmpty()) {
            int[] tmp = queue.poll();
            int x = tmp[0];
            int y = tmp[1];
            int dist = tmp[2];
            if(x == lenX-1 && y == lenY-1) return dist;
            for(int i=0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx < 0 || nx >= lenX || ny < 0 || ny >= lenY) continue;
                if(!visited[nx][ny] && maps[nx][ny] == 1) {
                    visited[nx][ny] = true;
                    queue.offer(new int[]{nx, ny, dist + 1});
                }
            }
        }
        return -1;
    }
}