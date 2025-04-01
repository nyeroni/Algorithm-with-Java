import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<int[]> queue = new LinkedList<>();
        for(int i=0; i<priorities.length; i++) {
            queue.offer(new int[]{i, priorities[i]});
        }
        boolean []visited = new boolean[priorities.length];
        while(!queue.isEmpty()) {
            int []now = queue.poll();
            int idx = now[0];
            int num = now[1];
            visited[idx] = true;
            boolean flag = false;
            for(int i=0; i<priorities.length; i++) {
                if(visited[i]) continue;
                if(num < priorities[i]) {
                    flag = true;
                }
            }
            if(flag) {
                queue.offer(new int[] {idx, num});
                visited[idx] = false;
            } else {
                answer ++;
                if(location == idx) {
                    break;
                }
            }
        
        }
        return answer;
    }
}