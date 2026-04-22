import java.util.*;
class Solution {
    public long solution(int n, int[] works) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        long answer = 0;
        for(int w : works) {
            pq.offer(w);
        }
        while(!pq.isEmpty() && n > 0) {
            int now = pq.poll();
            if(!pq.isEmpty() && now >= pq.peek() || pq.isEmpty()) {
                now --;
                n--;
            }
            pq.offer(now);
        }
        for(int p : pq) {
            if(p < 0) p = 0;
            answer += p * p;
        }
        return answer;
    }
}