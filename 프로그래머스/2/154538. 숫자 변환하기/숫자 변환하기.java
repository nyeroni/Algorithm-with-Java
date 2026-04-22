import java.util.*;
class Solution {
    public int solution(int x, int y, int n) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, 0});
        boolean[] visited = new boolean[y+1];
        while(!queue.isEmpty()) {
            int[]now = queue.poll();
            if(now[0] == y) return now[1];
            int a = now[0] + n;
            int b = now[0] * 2;
            int c = now[0] * 3;
            if(a <= y && !visited[a]) {
                visited[a] = true;
                queue.offer(new int[]{a, now[1] + 1});
            }
            if(b <= y && !visited[b]) {
                visited[b] = true;
                queue.offer(new int[]{b, now[1] + 1});
            }
            if(c <= y && !visited[c]) {
                visited[c] = true;
                queue.offer(new int[]{c, now[1] + 1});
            }
        }
        return -1;
    }
}