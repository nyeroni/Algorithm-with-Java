import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {
        String[] answer;
        List<String> tmp = new ArrayList<>();
        for(int i=0; i<strArr.length; i++) {
            String str = strArr[i];
            if(i%2 != 0) {
                tmp.add(str.toUpperCase());
            } else {
                tmp.add(str.toLowerCase());
            }
        }
        answer = new String[tmp.size()];
        int i=0;
        for(String str : tmp) {
            answer[i] = str;
            i++;
        }
        return answer;
    }
}