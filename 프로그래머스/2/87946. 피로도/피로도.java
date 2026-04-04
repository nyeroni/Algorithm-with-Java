import java.util.*;

class Solution {
    static int answer = 0;
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        dfs(dungeons, visited, 0, k);
        return answer;
    }
    private void dfs(int[][] dungeons, boolean[] visited, int depth, int k) {
        answer = Math.max(answer, depth);
        for(int i=0; i<dungeons.length; i++) {
            if(!visited[i] && k >= dungeons[i][0]) {
                visited[i] = true;
                dfs(dungeons, visited, depth + 1, k - dungeons[i][1]);
                visited[i] = false;
            }
        }
    }
}