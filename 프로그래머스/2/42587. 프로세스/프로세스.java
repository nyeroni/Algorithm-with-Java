import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>();
        for(int i=0; i<priorities.length; i++) {
            queue.offer(new int[]{i, priorities[i]});
        } 
        boolean []visited = new boolean[priorities.length];
        int[] tmp = new int[priorities.length];
        int k=0;
        while(!queue.isEmpty()) {
            int[] now = queue.poll();
            int idx = now[0];
            int num = now[1];
            visited[idx] = true;
            boolean flag = false;
            for(int i=0; i<priorities.length; i++) {
                if(!visited[i] && num < priorities[i]) {
                    flag = true;
                }
            }
            if(flag) {
                queue.offer(new int[]{idx, num});
                visited[idx] = false; 
            } else {
                tmp[k] = idx;
                k++;
            }
        }
        int answer =0;
        for(int i=0; i<tmp.length; i++) {
            // System.out.println("tmp[i] : " +tmp[i]);
            if(tmp[i] == location) {
                answer = i+1;
            }
        }
        return answer;
    }
}