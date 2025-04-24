import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int []di = {-1, 1, 0, 0};
        int []dj = {0, 0, -1, 1};
        
        int row = maps.length;
        int col = maps[0].length;
        
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[row][col];
        
        queue.offer(new int[]{0, 0, 1});
        visited[0][0] = true;
        
        while(!queue.isEmpty()) {
            int []current = queue.poll();
            int i = current[0];
            int j = current[1];
            int dist = current[2];
            
            if(i == row-1 && j == col-1) {
                return dist;
            }
            for(int k=0; k<4; k++) {
                int ni = di[k] + i;
                int nj = dj[k] + j;
                if(ni >= 0 && ni < row && nj >= 0 && nj < col) {
                    if(!visited[ni][nj] && maps[ni][nj] == 1) {
                        visited[ni][nj] = true;
                        queue.offer(new int[]{ni, nj, dist + 1});
                    }
                }
            }
        }
        return -1;
    }
}