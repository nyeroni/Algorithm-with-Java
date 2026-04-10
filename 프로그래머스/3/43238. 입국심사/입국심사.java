import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        long i = 1;
        Arrays.sort(times);
        long j = (long) times[times.length-1] * n;
        long mid = 0;
        while(i <= j) {
            mid = (i + j)/2;
            long cnt = 0;
            for(int k=0; k<times.length; k++) {
                cnt += mid / times[k];
                if(cnt >= n) break;
            }
            if(cnt >= n) {
                answer = mid;
                j = mid - 1;
            } else if(cnt < n) {
                i = mid + 1;
            }
        }
        return answer;
    }
}