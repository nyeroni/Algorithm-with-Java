import java.util.*;
class Solution {
    static class Bridge{
        int to;
        int cost;
        Bridge(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }
    }
    public int solution(int n, int[][] costs) {
        List<Bridge>[] graph = new ArrayList[n];
        for(int i=0; i<n; i++) {
            graph[i] = new ArrayList<>();
        }
        for(int[] cost : costs) {
            int a = cost[0];
            int b = cost[1];
            int price = cost[2];
            
            graph[a].add(new Bridge(b, price));
            graph[b].add(new Bridge(a, price));
        }
        
        boolean[] visited = new boolean[n];
        PriorityQueue<Bridge> pq = new PriorityQueue<>(
            (a, b) -> a.cost - b.cost
        );
        pq.offer(new Bridge(0, 0));
        int answer = 0;
        int count = 0;
        
        while(!pq.isEmpty()) {
            Bridge now = pq.poll();
            System.out.println("now : " + now.to + ", " + now.cost);
            if(visited[now.to]) continue;
            visited[now.to] = true;
            answer += now.cost;
            count ++;
            if(count == n) break;
            for(Bridge next : graph[now.to]) {
                System.out.println("next : " + next.to + ", " + next.cost);
                if(!visited[next.to]) {
                    pq.offer(next);
                }
            }
        }
        return answer;
    }
}