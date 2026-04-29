import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        long left = 0;
        Arrays.sort(times);
        long right = n * (long)times[times.length-1];
        long answer = 0;
        while(left <= right) {
            long mid = (left + right) / 2;
            long sum = 0;
            for(int time : times) {
                sum += mid / time;
                // if(sum >= n) break;
            }
            // System.out.println("sum : " + sum);
            if(sum >= n) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;                
            }
        }
        return answer;
    }
}