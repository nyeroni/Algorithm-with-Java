import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int s : scoville) {
            pq.add(s);
        }
        if(pq.peek() >= K) return 0;
        while(pq.size()>1) {
            int a = pq.poll();
            int b = pq.poll();
            int sum = a + b*2;
            pq.add(sum);
            answer ++;
            if(pq.peek() >= K) {
                break;
            }
        }
        if(pq.size() == 1 && pq.peek() < K) return -1;
        return answer;
    }
}