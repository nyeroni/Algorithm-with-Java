import java.util.*;

class Solution {
    public int solution(String dirs) {
        int answer = 0;
        Queue<int[]> queue = new LinkedList<>();
        List<String> list = new ArrayList<>();
        queue.offer(new int[]{0, 0});
        int nx, ny;
        String strA = "", strB = "";
        for(int i=0; i<dirs.length(); i++) {
            char c = dirs.charAt(i);
            strA = "";
            strB = "";
            int[] now = queue.poll();
            int x = now[0];
            int y = now[1];
            
            nx = x;
            ny = y;
            if(c == 'U') {
                ny = y + 1;
            } else if(c == 'D') {
                ny=y - 1;
            } else if(c == 'R') {
                nx = x + 1;
            } else if(c == 'L') {
                nx = x - 1;
            }
            if(nx > 5 || ny > 5 || nx < -5 || ny < -5) {
                queue.offer(new int[]{x, y});
                continue;
            }
            strA = x + ","+ y + "," + nx + "," + ny;
            strB = nx + ","+ ny + "," + x + "," + y;
            // System.out.println("strA : " + strA + ", strB : " + strB);
            if(!list.contains(strA) && !list.contains(strB)) {
                list.add(strA);
                list.add(strB);
                answer ++;
            }
            queue.offer(new int[]{nx, ny});
        }
        return answer;
    }
}