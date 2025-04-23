import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<scoville.length; i++) {
            pq.offer(scoville[i]);
        }
        
        while(true) {
            if(pq.peek() >= K) break;
            if(pq.size() < 2) return -1;
            int n = pq.poll();
            int m = pq.poll();
            int b = n + m * 2;
            pq.offer(b);
            answer ++;
        }
        return answer;
    }
}