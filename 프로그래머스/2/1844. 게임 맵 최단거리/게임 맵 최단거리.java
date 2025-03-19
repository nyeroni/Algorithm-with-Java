import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int rows = maps.length;
        int cols = maps[0].length;
        
        int[] di = {-1, 1, 0, 0};
        int[] dj = {0, 0, -1, 1};
        
        boolean[][] visited = new boolean[rows][cols];
        
        Queue<int[]> queue = new LinkedList<>();
        
        queue.add(new int[] {0, 0, 1});
        visited[0][0] = true;
        
        while(!queue.isEmpty()) {
            int [] current = queue.poll();
            int i = current[0];
            int j = current[1];
            int dist = current[2];
            
            if(i==rows - 1 && j==cols-1) {
                return dist;
            }
            for(int d=0; d<4; d++) {
                int ni = i + di[d];
                int nj = j + dj[d];
            
                if(ni >= 0 && ni < rows && nj >= 0 && nj < cols) {
                    if(maps[ni][nj] == 1 && !visited[ni][nj]) {
                        visited[ni][nj] = true;
                        queue.add(new int[] {ni, nj, dist+1});
                    }
                }
            }
        }
        return -1;
    }
}