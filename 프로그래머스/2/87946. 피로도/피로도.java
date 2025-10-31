import java.util.*;

class Solution {
    static int cnt = 0;
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
    
        dfs(dungeons, visited, k, k, 0);
        return cnt;
    }
    private void dfs(int[][] dungeons, boolean[] visited, int k, int energy, int depth) {
        cnt = Math.max(cnt, depth);
        for(int i=0; i<dungeons.length; i++) {
            if(!visited[i] && energy >= dungeons[i][0]) {
                visited[i] = true;
                dfs(dungeons, visited, k, energy-dungeons[i][1], depth + 1);
                visited[i] = false;
            }
        }
    }
}