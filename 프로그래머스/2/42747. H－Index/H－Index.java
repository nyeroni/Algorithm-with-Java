import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int cnt=0, h=0, answer = -1;
        Arrays.sort(citations);
        while(true) {
            cnt = 0;
            for(int i=0; i<citations.length; i++) {
                if(citations[i] >= h) {
                    cnt ++;
                }
            }
            if(cnt < h) {
                answer =  h -1;
                break;
            }
            h++;
        }
        return answer;
    }
}