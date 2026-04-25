import java.util.*;

class Solution {
    public int solution(int[] players, int m, int k) {
        int answer = 0;
        // m -> 1대 추가
        // m명 미만 -> 증설 x
        // n * m 이상 (n+1)*m 미만 -> n대 증설된 서버 운영중
        // 한 번 증설한 서버는 k시간동안 운영
        // k=5라면 10시에 증설한 서버는 10 - 15
        
        Queue<Integer> queue = new LinkedList<>();
        int time = 1;
        for(int player : players) {
            // System.out.println("player : " + player + ", time : " + time + ", queue.size() : " + queue.size());
            int size = queue.size();
            for(int i=0; i<size; i++) {
                int num = queue.poll()-1;
                // System.out.println("num : " + (num+1) + "시간 남음");
                if(num > 0) queue.offer(num);
            }
            
            if(player >= m) {
                 if(!queue.isEmpty() && queue.size() >= player/m) {
                     continue;
                 }
                 else {
                     // System.out.println("player/m - queue.size() : " + (player/m - queue.size()) + "개 만들거임");
                     int len = queue.size();
                     for(int j=0; j<player/m - len; j++) {
                          queue.offer(k);
                          // System.out.println("증설합니다.");
                          answer ++;
                     }
                 }
             }
        }
        return answer;
    }
}