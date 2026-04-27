import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        List<Integer>[] graph = new ArrayList[n+1];
        for(int i=1; i<=n; i++) {
            graph[i] = new ArrayList<>();
        }
        for(int[] e : edge) {
            int a = e[0];
            int b = e[1];
            
            graph[a].add(b);
            graph[b].add(a);
        } 
        
        int[] dist = new int[n+1];
        Arrays.fill(dist, -1);
        
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        dist[1] = 1;
        while(!queue.isEmpty()) {
            int now = queue.poll();
            for(int next : graph[now]) {
                if(dist[next] == -1) {
                    dist[next] = dist[now] + 1;
                    queue.offer(next);
                }
            }
        }
        int max = 0;
        int answer = 0;
        for(int d : dist) {
            if(d > max) {
                max = d;
                answer = 1;
            } else if(max == d) {
                answer ++;
            }
        }
        return answer;
    }
}