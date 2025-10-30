import java.util.*;

class Solution {
    int max = 0;
    public int solution(int k, int[][] dungeons) {
        boolean []visited = new boolean[dungeons.length];
        dfs(visited, dungeons, k, 0);
        return max;
    }
    private void dfs(boolean[] visited, int[][]dungeons, int m, int depth) {
        max = Math.max(depth, max);
        for(int i=0; i<dungeons.length; i++) {
            if(!visited[i] && dungeons[i][0] <= m ) {
                visited[i] = true;
                dfs(visited, dungeons, m-dungeons[i][1], depth + 1);
                visited[i] = false;
            }
        }
    }
}