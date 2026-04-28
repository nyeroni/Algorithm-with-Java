import java.util.*;
class Solution {
    static class Bridge {
        int to;
        int cost;
        Bridge(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }
    }
    static boolean[][] graph;
    static List<Bridge> list = new ArrayList<>();
    public int solution(int n, int[][] costs) {
        List<Bridge>[] graph = new ArrayList[n];
        for(int i=0; i<n; i++) {
            graph[i] = new ArrayList<>();
        }
        for(int[] c : costs) {
            int a = c[0];
            int b = c[1];
            int price = c[2];
            
            graph[a].add(new Bridge(b, price));
            graph[b].add(new Bridge(a, price));
        }
        
        boolean[] visited = new boolean[n];
        PriorityQueue<Bridge> pq = new PriorityQueue<>((a, b) -> {
            return a.cost - b.cost;
        });
        pq.offer(new Bridge(0, 0));
        int answer = 0;
        int count = 0;
        while(!pq.isEmpty()) {
            Bridge now = pq.poll();
            if(visited[now.to]) continue;
            visited[now.to] = true;
            answer += now.cost;
            count ++;
            if(count == n) break;
            for(Bridge next : graph[now.to]) {
                if(!visited[next.to]) {
                    pq.offer(next);
                }
            }
        }
        return answer;
        
    }
    public void connect() {
        
    }
}