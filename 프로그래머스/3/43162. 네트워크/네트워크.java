import java.util.*;
class Solution {
    static int answer = 0;
    public int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[n];
        for(int i=0; i<n; i++) {
            if(!visited[i]) {
                dfs(computers, visited, i);
                answer ++;
            }
        }
        return answer;
    }
    private void dfs(int[][]computers, boolean[] visited, int node) {
        visited[node] = true;
        for(int i=0; i<computers[node].length; i++) {
            if(!visited[i] && computers[node][i] == 1) {
                dfs(computers, visited, i);
            }
        }
    }
}