import java.util.*;

class Solution {
    public int[] solution(int n, int[][] roads, int[] sources, int destination) {
        List<Integer>[] graph = new ArrayList[n+1];
        for(int i=1; i<=n; i++) {
            graph[i] = new ArrayList<>();
        }
        for(int[] road : roads) {
            graph[road[0]].add(road[1]);
            graph[road[1]].add(road[0]);
        }
        int[] dist = new int[n+1];
        Arrays.fill(dist, -1);
        
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(destination);
        dist[destination] = 0;
        while(!queue.isEmpty()) {
            int now = queue.poll();
            for (int next : graph[now]) {
                if(dist[next] == -1) {
                    dist[next] = dist[now] + 1;
                    queue.offer(next);
                }
            }
        }
        int[] answer = new int[sources.length];
        for(int i=0; i<sources.length; i++) {
            answer[i] = dist[sources[i]];
        }
        return answer;
    }
}