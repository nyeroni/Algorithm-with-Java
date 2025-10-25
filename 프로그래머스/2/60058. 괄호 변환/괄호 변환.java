import java.util.*;

class Solution {
    public String solution(String p) {
        if(p.isEmpty()) return "";
        
        int idx = splitIndex(p);
        String u = p.substring(0, idx);
        String v = p.substring(idx);
        
        if(isCorrect(u)) {
            return u + solution(v);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("(");
            sb.append(solution(v));
            sb.append(")");
            sb.append(reverse(u.substring(1, u.length() - 1)));
            return sb.toString();
        }
    }
    private int splitIndex(String s) {
        int balance = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(') balance ++;
            else balance --;
            if(balance == 0) return i+1;
        }
        return s.length();
    }
    private boolean isCorrect(String s) {
        int cnt = 0;
        for(char c : s.toCharArray()) {
            if(c == '(') cnt ++;
            else cnt --;
            if(cnt < 0) return false;
        }
        return cnt == 0;
    }
    private String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()) {
            sb.append(c == '(' ? ')': '(');
        }
        return sb.toString();
    }
}