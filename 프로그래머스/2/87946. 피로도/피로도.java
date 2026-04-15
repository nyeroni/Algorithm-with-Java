import java.util.*;

class Solution {
    static int answer = 0;
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        
        Arrays.sort(dungeons, (a, b) -> {
            if(a[0] == b[0]) return a[1] - b[1];
            return b[0] - a[0];
        });
        dfs(k, dungeons, visited, 0);
        return answer;
    }
    private void dfs(int k, int[][] dungeons, boolean[] visited, int depth) {
  
        answer = Math.max(answer, depth);
        for(int i=0; i<dungeons.length; i++) {
            if(!visited[i] && dungeons[i][0] <= k) {
                visited[i] = true;
                dfs(k - dungeons[i][1], dungeons, visited, depth + 1);
                visited[i] = false;
            }
        }
    }
}