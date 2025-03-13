import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = -1;
        Arrays.sort(citations);

        // [1, 10, 11] -> 2
        // 3 - 1
        int j=0;
        while(true) {
            int cnt = 0;
            for(int i=0; i<citations.length; i++) {   
                if(citations[i] >= j) {
                    cnt++;
                }
            }
            if(cnt < j) {
                answer = j-1;
                break;
            }
            j++;
        }
        if(answer == -1) {
            answer = citations.length;
        }
        return answer;
    }
}