import java.util.*;
class Solution {
    public int solution(int x, int y, int n) {
        int cnt = 0;
        Queue<int[]> queue = new LinkedList<>();
        boolean[] visited = new boolean[1000000*3];
        queue.offer(new int[]{x, 0});
        while(!queue.isEmpty()) {
            int []now = queue.poll();
            if(now[0] == y) {
                return now[1];
            }
            if(!visited[now[0] + n] && now[0] + n <= y) {
                visited[now[0] + n] = true;
                queue.offer(new int[]{now[0] + n, now[1] + 1});
            }
             if(!visited[now[0] * 2] && now[0] * 2 <= y) {
                visited[now[0] * 2] = true;
                queue.offer(new int[]{now[0] * 2, now[1] + 1});
            }
            if(!visited[now[0] * 3] && now[0] * 3 <= y) {
                visited[now[0] * 3] = true;
                queue.offer(new int[]{now[0] * 3, now[1] + 1});
            }
        }
        return -1;
    }
}