import java.util.*;

class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        String answer = "";
        int j = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == ' ') {
                    answer += " ";
                    j=0;
                    continue;
            }
            if(j == 0) {
                answer += String.valueOf((s.charAt(i))).toUpperCase();
                j++;
            } 
            else {
                answer += s.charAt(i);
                j++;
            }
        }
        return answer;
    }
}