import java.util.*;

class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = schedules.length;
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<timelogs.length; i++) {
            int startTime = schedules[i];
            int endTime = schedules[i];
            int count = 0;
            if((schedules[i] + 10)%100 >= 60) {
                endTime += 50; 
            }
            else endTime += 10;
            System.out.println("startTime : "+ startTime);
            System.out.println("endTime : "+ endTime);
            for(int j=0; j<7; j++) {
                // System.out.println("timelogs[i][j] : " + timelogs[i][j]);
                // System.out.println("(j+startday) % 7 : " + (j+startday) % 7);
                if((j+startday) % 7 == 6 || (j+startday) % 7 == 0) {
                    continue;
                }
                if(timelogs[i][j] <= endTime) {
                    // System.out.println("PASS");
                    count ++;
                }
            }
            if(count != 5) answer--;
            
        }        
        return answer;
    }
}