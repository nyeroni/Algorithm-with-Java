import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        int ans = 0;
        for(int i=0; i<progresses.length; i++) {
            int num = 0;
            if((100 - progresses[i]) % speeds[i] == 0) {
                num = (100 - progresses[i]) / speeds[i];
            } else {
                num = (100 - progresses[i]) / speeds[i] + 1;
            }
            System.out.println("num : " + num);
            if(!queue.isEmpty() && queue.peek() < num) {
                while(!queue.isEmpty()) {
                    queue.poll();
                    ans ++;
                }
                answer.add(ans);
                ans = 0;
                queue.offer(num);
            }
            else {
                queue.offer(num);
            }
            
        }
        ans = 0;
        if(!queue.isEmpty()) {
            while(!queue.isEmpty()) {
                queue.poll();
                ans ++;
            }
        }
        answer.add(ans);
        return answer.stream().mapToInt(i->i).toArray();
    }
}