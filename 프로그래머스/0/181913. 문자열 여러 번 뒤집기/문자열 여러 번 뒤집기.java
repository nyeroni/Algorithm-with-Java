import java.util.*;

class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        List<String> str = new ArrayList<>();
        for(int i=0; i<my_string.length(); i++) {
            str.add(my_string.substring(i, i+1));
        }

        for(int i=0; i<queries.length; i++) {
            int []tmp = queries[i];
            int end = 0;
            if((tmp[1] - tmp[0] ) % 2 ==0) {
                end = (tmp[1] - tmp[0]) / 2;
            } else {
                end = (tmp[1] - tmp[0] ) / 2 + 1;
            }
            for(int j = 0; j < end; j++) {
                int s = tmp[0] + j;
                int e = tmp[1] - j;
                String t = str.get(s);
                str.remove(s);
                str.add(s, str.get(e-1));
                str.remove(e);
                str.add(e, t);
            }
        }
        for(String st : str) {
            answer += st;
        }
        return answer;
    }
}