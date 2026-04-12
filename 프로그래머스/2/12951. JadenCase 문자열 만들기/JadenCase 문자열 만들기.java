import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int k=0;
        s = s.toLowerCase();
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == ' ') {
                sb.append(" ");
                k=0;
                continue;
            } else if(k == 0 && s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                sb.append(String.valueOf(s.charAt(i)).toUpperCase());
            } else sb.append(String.valueOf(s.charAt(i)));
            k++;
        }
        return sb.toString();
    }
}