import java.util.*;

class Solution {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public int solution(int[][] maps) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0, 1});
        int n = maps.length, m = maps[0].length;
        boolean[][] visited = new boolean[n][m];
        visited[0][0] = true;
        while(!queue.isEmpty()) {
            int[] now = queue.poll();
            int x = now[0];
            int y = now[1];
            int dist = now[2];
            // System.out.println("x : " + x +", y : " + y + ", dist : " + dist);
            if(x == n-1 && y == m-1) {
                return dist;
            }
            for(int i=0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if(nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if(visited[nx][ny]) continue;
                if(maps[nx][ny] == 0) continue;
                visited[nx][ny] = true;
                queue.offer(new int[]{nx, ny, dist + 1});
            }
        }
        return -1;
    }
}