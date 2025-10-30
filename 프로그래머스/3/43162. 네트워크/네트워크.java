import java.util.*;
class Solution {
    public int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[n];
        int answer = 0;
        for(int i=0; i<n; i++) {
            if(!visited[i]) {
                dfs(computers, i, visited);
                answer ++;
            }
        }
        return answer;
    }
    private void dfs(int[][] computers, int node, boolean []visited) {
        visited[node] = true;
        for(int i=0; i<computers.length; i++) {
            if(!visited[i] && computers[node][i] == 1) {
                dfs(computers, i, visited);
            }
        }
    }
}