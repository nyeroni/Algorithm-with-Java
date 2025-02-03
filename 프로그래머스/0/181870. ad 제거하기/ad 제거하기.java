import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        String[] answer;
        List<String> answerTmp = new ArrayList<>();

        for(int i=0; i<strArr.length; i++) {
            if(!strArr[i].contains("ad")) {
                answerTmp.add(strArr[i]);
            }
        }
        answer = new String[answerTmp.size()];
        int i=0;
        for(String tmp : answerTmp) {
            answer[i] = tmp;
            i++;
        }
        return answer;
    }
}