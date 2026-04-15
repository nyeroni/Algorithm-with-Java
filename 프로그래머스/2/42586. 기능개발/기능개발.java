import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int n = 0;
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        int i = 0, cnt = 0;;
        while(i < progresses.length) {
            if((100 - progresses[i])%speeds[i] == 0) {
                n = (100 - progresses[i])/speeds[i];
            } else {
                n = (100 - progresses[i])/speeds[i] + 1;
            }
            if(!queue.isEmpty() && queue.peek() >= n) {
                cnt++;
            } else if(queue.isEmpty()) {
                queue.offer(n);
                cnt = 1;
            }
            else {
                list.add(cnt);
                cnt = 1;
                queue.poll();
                queue.offer(n);
            }
            i++;
        }
        
        list.add(cnt);
        return list.stream().mapToInt(j->j).toArray();
    }
}