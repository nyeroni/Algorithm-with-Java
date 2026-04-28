import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int p : priorities) {
            pq.offer(p);
        }
        for(int i=0; i< priorities.length; i++) {
            queue.offer(new int[]{i, priorities[i]});
        }
        int cnt = 0;
       // [2, 3, 0, 1]
        int[] answer = new int[priorities.length];
        while(!queue.isEmpty()) {
            int[] now = queue.poll();
            // System.out.println("now[0] : " + now[0] + ", now[1] : " + now[1] + ", peek() : " + pq.peek() + ", cnt : " + cnt);
            if(pq.peek() > now[1]) {
                queue.offer(now);
            } else if(pq.peek() == now[1]) {
                answer[cnt] = now[0];
                pq.poll();
                cnt ++;
            }
        }
        for(int i=0; i<answer.length; i++) {
            if(location == answer[i]) return i+1;
        }
        return -1;
    }
}