import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String[] solution(String[] str_list) {
        String[] answer;
        List<String> tmp = Arrays.asList(str_list);
        boolean flag = true;
        for(int i=0; i<str_list.length; i++) {
            if(str_list[i].equals("l")){
                tmp = tmp.subList(0, i);
                flag = false;
                break;
            } else if(str_list[i].equals("r")) {
                tmp = tmp.subList(i+1, str_list.length);
                flag = false;
                break;
            }
        }
        if(flag) {
            answer = new String[0];
        }
        else {
            answer = new String[tmp.size()];
            answer = tmp.toArray(answer);
        }
        return answer;
    }
}