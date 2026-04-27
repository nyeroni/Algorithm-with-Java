import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        Arrays.sort(times);
        long left = 0;
        long right = (long)n * times[times.length-1];
        while(left <= right) {
            // 7 14 21 28
            // 10 20 
            long mid = (left + right)/2;
            long sum = 0;
            for(int t : times) {
                sum += mid / t;
                if(sum >= n) break;
            }
            if(sum >= n) {
                right = mid - 1;
                answer = mid;
            } else if(sum < n){
                left = mid + 1;
            }
        }
        return answer;
    }
}