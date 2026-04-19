import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int i=0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int s : scoville) {
            pq.offer(s);
        }
        int answer = 0;
        while(pq.size() >= 2) {
            int a = pq.poll();
            if(a >= K) break;
            int b = pq.poll();
            int num = 0;
            if(a < K) {
                num = a + b * 2;
            }
            pq.offer(num);
            answer ++;
        }
        if(pq.poll() < K) return -1;
        return answer;
    }
}