import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        Arrays.sort(str, Comparator.reverseOrder());
        for(String st : str) {
            answer += st;
        }
        
        return answer;
    }
}