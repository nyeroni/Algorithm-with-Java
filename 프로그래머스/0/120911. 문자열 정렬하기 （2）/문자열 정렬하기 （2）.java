import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        my_string = my_string.toLowerCase();
        String[] tmp = my_string.split("");
        Arrays.sort(tmp);
        for(String s : tmp) {
            answer += s;
        }
        return answer;
    }
}