import java.util.*;

class Solution {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public int[] solution(String[] maps) {
        int n = maps.length;
        int m = maps[0].length();
        boolean[][] visited = new boolean[n][m];
        List<Integer> answer = new ArrayList<>();
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(!visited[i][j] && maps[i].charAt(j) != 'X') {
                    int sum = bfs(i, j, maps, visited);
                    answer.add(sum);
                }
            }
        }
        if(answer.size() == 0) return new int[]{-1};
        Collections.sort(answer);
        return answer.stream().mapToInt(i->i).toArray();
    }
    public int bfs(int x, int y, String[] maps, boolean[][] visited) {
        int n = maps.length;
        int m = maps[0].length();
        
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        visited[x][y] = true;
        
        int sum = 0;
        while(!queue.isEmpty()) {
            int[] now = queue.poll();
            int cx = now[0];
            int cy = now[1];
            
            sum += maps[cx].charAt(cy) - '0';
            
            for(int i=0; i<4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if(nx < 0 || nx >= n || ny < 0 || ny >= m) {
                    continue;
                }
                if(visited[nx][ny]) continue;
                if(maps[nx].charAt(ny) == 'X') continue;
                
                visited[nx][ny] = true;
                queue.offer(new int[]{nx, ny});
            }
            
        }
        return sum;
    }
}