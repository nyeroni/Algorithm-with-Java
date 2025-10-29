import java.util.*;

class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String a : arr) {
            if(a.length() == 0) {
                sb.append(" ");
            }
            else {
                sb.append(a.substring(0, 1).toUpperCase());
                sb.append(a.substring(1, a.length()));
                sb.append(" ");
            }
        }
        String answer = sb.toString();
        if(s.charAt(s.length()-1) == ' ') {
            return answer;
        }
        return answer.substring(0, answer.length()-1);
    }
}