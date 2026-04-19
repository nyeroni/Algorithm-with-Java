import java.util.*;

class Solution {
    public int solution(String dirs) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});
        int answer = 0;
        List<String> list = new ArrayList<>();
        
        for(int i=0; i<dirs.length(); i++) {
            char c = dirs.charAt(i);
            int[] now = queue.poll();
            int x = now[0];
            int y = now[1];
            int nx = x, ny = y;
                        
            if(c == 'U' && ny + 1 <= 5) {
                ny += 1;
            } else if(c == 'D' && ny - 1 >= -5) {
                ny -= 1;
            } else if(c == 'R' && nx + 1 <= 5) {
                nx += 1;
            } else if(c == 'L' && nx - 1 >= -5) {
                nx -= 1;
            }
            
            queue.offer(new int[]{nx, ny});

            if(nx == x && ny == y) continue;
            String strA = String.valueOf("" + x + y + nx + ny);
            String strB = String.valueOf("" + nx + ny + x + y);
            
            if(list.contains(strA) || list.contains(strB)) {
                continue;
            } else {
                list.add(strA);
                list.add(strB);
                answer ++;
            }
        }
        return answer;
    }
}