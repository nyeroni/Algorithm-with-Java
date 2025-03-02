import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replace("a", " ");
        myStr = myStr.replace("b", " ");
        myStr = myStr.replace("c", " ");

        String[] answer = myStr.split(" ");
        List<String> tmp = new ArrayList<>();

        for(String str : answer) {
            if(!str.equals("")) {
                tmp.add(str);
            }
        }
        if(tmp.size() == 0) {
            tmp.add("EMPTY");
        }

        answer = tmp.stream().toArray(String[]::new);

        return answer;
    }
}