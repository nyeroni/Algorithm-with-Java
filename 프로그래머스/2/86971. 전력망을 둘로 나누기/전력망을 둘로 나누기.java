import java.util.*;
class Solution {
    static int count = 0;
    static boolean[][] graph;
    static boolean[] visited;
    public int solution(int n, int[][] wires) {
        graph = new boolean[n+1][n+1];
        int answer = Integer.MAX_VALUE;
        
        for(int[] wire : wires) {
            int a = wire[0];
            int b = wire[1];
            graph[a][b] = true;
            graph[b][a] = true;
        }
       for(int[] wire : wires) {
            int a = wire[0];
            int b = wire[1];
            graph[a][b] = false;
            graph[b][a] = false;
           
            count = 0;
            visited = new boolean[n+1];
            dfs(1, n);
           
            answer = Math.min(Math.abs(count - (n-count)), answer);
            graph[a][b] = true;
            graph[b][a] = true;
       }
        return answer;
    }
    private void dfs(int node, int n) {
        visited[node] = true;
        count ++;
        for(int next = 1; next <= n; next++) {
            if(!visited[next] && graph[node][next]) {
                dfs(next, n);
            }
        }
    }
}