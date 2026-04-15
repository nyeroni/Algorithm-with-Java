import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int n = citations.length;
        Arrays.sort(citations);
        int max = citations[citations.length-1];
        int cnt = 0;
        while(true) {
            if(max < cnt) break;
            if(count(citations, cnt)) {
                answer = cnt;
            }
            cnt ++;
        }
        
        return answer;
    }
    private boolean count(int[] citations, int n) {
        int cnt = 0;
        for(int i=0; i<citations.length; i++) {
            if(citations[i] >= n) {
                cnt ++;
            }
        }
        if(cnt >= n && citations.length - cnt <= n) return true;
        return false;
    }
}