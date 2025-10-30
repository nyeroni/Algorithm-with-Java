import java.util.*;

class Solution {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int max = 0;
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        int[][] dist = new int[n][m];
        boolean[][] visited = new boolean[n][m];
        
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});
        visited[0][0] = true;
        dist[0][0] = 1;
        
        while(!queue.isEmpty()) {
            int[] now = queue.poll();
            int x = now[0];
            int y = now[1];
            
            for(int i=0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if(nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if(maps[nx][ny] == 0 || visited[nx][ny]) continue;
                visited[nx][ny] = true;
                queue.offer(new int[]{nx, ny});
                dist[nx][ny] = dist[x][y] + 1;
            }
        }
        return dist[n-1][m-1] == 0 ? -1 : dist[n-1][m-1];
        
    }
}