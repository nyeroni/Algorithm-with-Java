import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = -1;
        Arrays.sort(citations);
        //0 1 3 5 6
        int h = 0;
        int cnt = 0;
        while(true) {
            cnt = 0;
            for(int i=0; i<citations.length; i++) {
                if(citations[i] >= h) {
                    cnt ++;
                }
            }
            if(cnt < h) {
                answer = h-1;
                break;
            }
            h++;
        }
        
        return answer;
    }
}