import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int []answer;
        
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<progresses.length; i++) {
            int n = (int)Math.ceil((100.0 - progresses[i])/speeds[i]);
            queue.offer(n);
        }
        List<Integer> tmp = new ArrayList<>();
        while(!queue.isEmpty()) {
            int m = queue.poll();
            int count = 1;
            while(!queue.isEmpty()) {
                int k = queue.peek();
                if(k <= m) {
                    queue.poll();
                    count ++;
                } else {
                    break;
                }
            }
            tmp.add(count);
        }
        answer = tmp.stream().mapToInt(i->i).toArray();
        return answer;
    }
}