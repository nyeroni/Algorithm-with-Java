import java.util.*;

class Solution {
    int max = 0;
    public int solution(int k, int[][] dungeons) {
        boolean[]visited = new boolean[dungeons.length];
        dfs(k, dungeons, visited, 0);
        return max;
    }
    public void dfs(int k, int [][]dungeons, boolean[] visited, int depth) {
        max = Math.max(depth, max);
        for(int i=0; i<dungeons.length; i++) {
            if(!visited[i] && k >= dungeons[i][0]) {
                visited[i] = true;
                dfs(k - dungeons[i][1], dungeons, visited, depth+1);
                visited[i] = false;
            }
        }
    }
}