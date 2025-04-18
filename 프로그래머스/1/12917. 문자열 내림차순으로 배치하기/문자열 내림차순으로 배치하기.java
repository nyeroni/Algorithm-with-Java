import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String [] ans = s.split("");
        Arrays.sort(ans, Comparator.reverseOrder());
        for(String str : ans) {
            answer += str;
        }
        return answer;
    }
}