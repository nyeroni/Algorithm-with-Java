import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        
        // 1379
        // 1126
        
        // 1357
        // 2268
        boolean[] visited = new boolean[B.length];
        Queue<int[]> queue = new LinkedList<>();
        for(int i=0; i<B.length; i++) {
            queue.offer(new int[]{B[i], i});
        }
        for(int i=0; i<A.length; i++) {
            while(!queue.isEmpty()) {
                int[] now = queue.poll();
                if(!visited[now[1]] && A[i] < now[0]) {
                    answer ++;
                    visited[now[1]] = true;
                    break;
                }
            }
        }
        
        return answer;
    }
}