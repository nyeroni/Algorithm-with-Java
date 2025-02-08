import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        // List<String> tmp = new ArrayList<>();
        // for(int i=0; i<my_string.length; i++) {
        //     tmp.add(my_string.charAt(i));
        // }
        int cnt = 0;
        for(int i=0; i<my_string.length(); i++) {
            cnt=0;
            for(int j=0; j<indices.length; j++) {
                if(indices[j] == i) {
                    cnt++;
                }
            }
            if(cnt == 0) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}