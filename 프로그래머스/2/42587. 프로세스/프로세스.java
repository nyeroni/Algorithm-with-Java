import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>();
        int answer = 0;
        for(int i=0; i<priorities.length; i++) {
            queue.offer(new int[]{i, priorities[i]});
        } 
        while(!queue.isEmpty()) {
            int[] tmp = queue.poll();
            boolean flag = false;
            for(int[] q : queue) {
                if(tmp[1] < q[1]) {
                    flag = true;
                    break;
                }
            }
            if(flag) {
                queue.offer(tmp);
            } else {
                answer ++;
                if(tmp[0] == location) return answer;
            }
        }
        return answer;
    }
}