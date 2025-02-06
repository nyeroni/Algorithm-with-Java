import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer;
        List<String> tmp = new ArrayList<>();
        for(int j=0; j<my_string.length(); j++) {
            String str = "";
            for(int i=my_string.length()-j-1; i<my_string.length(); i++) {
                str += my_string.charAt(i);
            }
            tmp.add(str);
        }
        answer = new String[tmp.size()];
        answer = tmp.toArray(answer);
        Arrays.sort(answer);
        return answer;
    }
}