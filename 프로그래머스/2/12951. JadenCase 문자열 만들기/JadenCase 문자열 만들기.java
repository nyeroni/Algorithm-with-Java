import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        String[] str = s.split(" ");
        for(String st : str) {
            if(st.length() == 0) {
                answer += " ";
            }
            else {
                answer += st.substring(0, 1).toUpperCase();
                answer += st.substring(1, st.length());
                answer += " ";
            }
        }
        if(s.charAt(s.length()-1) == ' ')return answer;
        answer = answer.substring(0, answer.length()-1);
        return answer;
    }
}