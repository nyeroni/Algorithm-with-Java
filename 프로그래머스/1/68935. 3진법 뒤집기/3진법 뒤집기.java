import java.util.*;

class Solution {
    public int solution(int n) {
        String s = Integer.toString(n, 3);
        String tmp = "";
        for(int i=s.length()-1; i>=0; i--) {
            tmp += s.charAt(i);
        }
        int answer = Integer.valueOf(tmp, 3);
        return answer;
    }
}