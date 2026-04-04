import java.util.*;
class Solution {
    static boolean[][] graph;
    static boolean[] visited;
    static int count;
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        graph = new boolean[n+1][n+1];
        
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

            visited = new boolean[n+1];
            count = 0;
            dfs(1, n);
            answer = Math.min(answer, Math.abs(count - (n - count)));
            
            graph[a][b] = true;
            graph[b][a] = true;
        }
        return answer;
    }
    private void dfs(int node, int n) {
        visited[node] = true;
        count ++;
        for(int next = 1; next <= n; next ++) {
            if(graph[node][next] && !visited[next]) {
                dfs(next, n);
            }
        }
    }
}