import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i=0; i<scoville.length; i++) {
            queue.add(scoville[i]);
        }
        int answer = 0;
        while(queue.size() >= 2 && queue.peek() < K) {
            int a = queue.poll();
            int b = queue.poll();
            int c = a + b * 2;
            queue.add(c);
            answer ++;
        }
        if(queue.peek() < K) answer = -1;
        return answer;
    }
}