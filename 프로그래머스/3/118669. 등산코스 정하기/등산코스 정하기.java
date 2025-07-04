import java.util.*;
class Solution {
    static class Node {
        int to, weight;
        Node(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }
    public int[] solution(int n, int[][] paths, int[] gates, int[] summits) {
        List<List<Node>> graph = new ArrayList<>();
        for(int i=0; i<=n; i++) {
            graph.add(new ArrayList<>());
        }
        for(int[] path : paths) {
            graph.get(path[0]).add(new Node(path[1], path[2]));
            graph.get(path[1]).add(new Node(path[0], path[2]));
        }
        
        boolean[] isSummit = new boolean[n+1];
        for(int summit : summits) {
            isSummit[summit] = true;
        }
        
        int[] intensity = new int[n+1];
        Arrays.fill(intensity, Integer.MAX_VALUE);
        
        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.weight-b.weight);
        for(int gate: gates) {
            pq.offer(new Node(gate, 0));
            intensity[gate] = 0;
        }
        
        while(!pq.isEmpty()) {
            Node now = pq.poll();
            if(intensity[now.to] < now.weight || isSummit[now.to]) continue;
            for(Node next : graph.get(now.to)) {
                int max = Math.max(intensity[now.to], next.weight);
                if(intensity[next.to] > max) {
                    intensity[next.to] = max;
                    pq.offer(new Node(next.to, max));
                }
            }
        }
        int minSummit = 0;
        int minIntensity = Integer.MAX_VALUE;
        Arrays.sort(summits);
        for(int summit : summits) {
            if(intensity[summit] < minIntensity) {
                minIntensity = intensity[summit];
                minSummit = summit;
            }
        }
        return new int[]{minSummit, minIntensity};
    }
}