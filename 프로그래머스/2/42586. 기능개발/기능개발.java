import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> answer = new ArrayList<>();
        int cnt = 0;
        for(int i=0; i<progresses.length; i++) {
            int day = 0;
            if((100 - progresses[i]) % speeds[i] == 0) {
                day = (100 - progresses[i]) / speeds[i];
            } else {
                day = (100 - progresses[i]) / speeds[i] + 1;
            }
            // System.out.println("day : " + day + ", queue.peek() : " + queue.peek() + ", cnt : " + cnt);
            if (queue.isEmpty()) {
                queue.offer(day);
                cnt = 0;
            } else if (queue.peek() < day) {
                queue.poll();
                queue.offer(day);
                answer.add(cnt);
                cnt = 0;
            }
            cnt ++;
        }
        answer.add(cnt);
        return answer.stream().mapToInt(i->i).toArray();
    }
}