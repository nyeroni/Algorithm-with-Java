import java.util.*;

class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        for(int k=0; k<schedules.length; k++) {
            int cnt = 0;
            schedules[k] = schedules[k] + 10;
            if(schedules[k] % 100 > 59) {
                schedules[k] = (schedules[k] / 100 + 1) * 100 + (schedules[k] % 100) - 60;
            }
            System.out.println("schedules[k] : " + schedules[k]);
            for(int i=0; i<timelogs[k].length; i++) {
                // System.out.println("(i + timelogs) % 7 : " + ((i + startday) % 7));
                if( (i + startday) % 7 == 0 ||  (i + startday) % 7 == 6) {
                    continue;
                }
                
                
                // System.out.println("schedules[k] : " + schedules[k] +", schedules[k] + 10 : " + (schedules[k] + 10) + ", timelogs[k][i] : "+ timelogs[k][i]);
                if(timelogs[k][i] <= schedules[k]) {
                    cnt ++;
                }
            }
            // System.out.println("cnt : " + cnt);
            if(cnt == 5) answer ++;
        }
        return answer;
    }
}