import java.util.*;
class Solution {
    public int solution(int[] citations) {
        // Arrays.sort(citations);
        int cnt = 1;
        int max = 0;
        for(int i : citations) {
            if(max <= i) max = i;
        }
        int answer = 0;
        while(true) {
            if(max < cnt) break;
            // System.out.println("i : " + cnt);
            if(count(citations, cnt)) {
                answer = cnt;
            }
            cnt ++;
        }
        return answer;
    }
    private boolean count(int [ ] citations, int n) {
        int cnt = 0;
        int len = citations.length;
        for(int i : citations) {
            if(n <= i) {
                cnt ++;
            }
        }
        // System.out.println("cnt : " +  cnt);
        if(cnt >= n && len - cnt < n) {
            return true;
        }
        return false;
    }
}