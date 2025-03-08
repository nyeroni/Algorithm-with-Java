import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String [] str = s.split(" ");
        for(String i : str) {
            if(i.length() == 0) {
                answer += " ";
            }
            else {
                answer += i.substring(0, 1).toUpperCase();
                answer += i.substring(1, i.length()).toLowerCase();
                answer += " ";
            }
        }
        if(s.charAt(s.length()-1) == ' ') {
            return answer;
        }
        answer = answer.substring(0, answer.length()-1);
        return answer;
    }
}