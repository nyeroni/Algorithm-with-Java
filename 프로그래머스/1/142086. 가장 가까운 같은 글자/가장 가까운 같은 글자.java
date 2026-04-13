import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        for(int i=s.length()-1; i>0; i--) {
            int c = s.charAt(i);
            for(int j=i-1; j>=0; j--) {
                if(c == s.charAt(j)) {
                    answer[i] = i - j;
                    break;
                }
            }
        }
        for(int i=0; i<answer.length; i++) {
            if(answer[i] == 0) answer[i] = -1;
        }
        return answer;
    }
}