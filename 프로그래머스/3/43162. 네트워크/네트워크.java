import java.util.*;
class Solution {
    static boolean[] visited;
    public int solution(int n, int[][] computers) {
        boolean[][] graph = new boolean[n][n];
        int answer =0;
        visited = new boolean[n];
        for(int i=0; i<computers.length; i++) {
            for(int j=0; j<computers[0].length; j++) {
                if(computers[i][j] == 1) {
                    graph[i][j] = true;
                    graph[j][i] = true;
                }
            }
        }
        for(int i=0; i<n; i++) {
            if(!visited[i]) {
                visited[i] = true;
                dfs(i, graph, n);
                answer ++;
            }
        }
        return answer;
    }
    public void dfs(int node, boolean[][] graph, int n) {
        for(int i=0; i<n; i++) {
            if(!visited[i] && graph[node][i]) {
                visited[i] = true;
                dfs(i, graph, n);
            }
        }
    }
}