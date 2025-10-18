import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<progresses.length; i++) {
            int days = 0;
            if((100 - progresses[i]) % speeds[i] == 0) {
                days = (100 - progresses[i]) / speeds[i];
            } else days = (100 - progresses[i]) / speeds[i] + 1;
            queue.offer(days);
        }
        while(!queue.isEmpty()) {
            int m = queue.poll();
            int count = 1;
            while(!queue.isEmpty()) {
                int k = queue.peek();
                if(m >= k) {
                    queue.poll();
                    count ++;
                } else break;
            }
            list.add(count);
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}