import java.util.*;
class Solution {
    public long solution(int n, int[] works) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int w : works) {
            pq.offer(w);
        }
        for(int i=0; i<n; i++) {
            int num = pq.poll();
            pq.offer(num - 1);
        }
        long answer = 0;
        for(int num : pq) {
            if(num < 0) num = 0;
            answer += num * num; 
        }
        return answer;
    }
}