import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        int a = 0;
        int b = 0;
        int answer = 0;
        for(int i=0; i<progresses.length; i++) {
            int n = 100 - progresses[i];
            int tmp = 0;
            if(n % speeds[i] == 0) {
                tmp = n / speeds[i];
            } else tmp = n / speeds[i] + 1;
            if(!queue.isEmpty() && queue.peek() < tmp) {
                while(!queue.isEmpty()) {
                    queue.poll();
                    answer ++;
                }
                list.add(answer);
                answer = 0;
                queue.add(tmp);
            } else {
                queue.add(tmp);
            }
        }
        answer = 0;
        if(!queue.isEmpty()) {
            while(!queue.isEmpty()) {
                queue.poll();
                answer ++;
            }
        }
        list.add(answer);
        return list.stream().mapToInt(i->i).toArray();
    }
}