import java.util.*;

class Solution {
    static int count = 0;
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        dfs(dungeons, visited, 0, k);
        return count;
    }
    private void dfs(int[][] dungeons, boolean[] visited, int depth, int energy) {
        count = Math.max(count, depth);
        for(int i=0; i<dungeons.length; i++) {
            int a = dungeons[i][0];
            int b = dungeons[i][1];
            if(!visited[i] && a <= energy) {
                visited[i] = true;
                dfs(dungeons, visited, depth + 1, energy-b);
                visited[i] = false;
            }
        }
    }
}