import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        int cnt = 0;
        for(int i=0; i<progresses.length; i++) {
            int num = 0;
            if((100 - progresses[i])%speeds[i] == 0) {
                num = (100 - progresses[i])/speeds[i];
            } else num = (100 - progresses[i])/speeds[i] + 1;
            if(!queue.isEmpty() && queue.peek() < num) {
                while(!queue.isEmpty()) {
                    queue.poll();
                    cnt ++;
                }
                list.add(cnt);
                cnt = 0;
                queue.offer(num);
            } else {
                queue.offer(num);
            }
        }
        cnt = 0;
        if(!queue.isEmpty()) {
             while(!queue.isEmpty()) {
                    queue.poll();
                    cnt ++;
                }
        }
        list.add(cnt);
        return list.stream().mapToInt(i->i).toArray();
    }
}