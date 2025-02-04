import java.util.*;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer;
        List<String> tmp = new ArrayList<>();
        for(int i=0; i<finished.length; i++) {
            if(!finished[i]) {
                tmp.add(todo_list[i]);
            }
        }
        answer = new String[tmp.size()];
        int i=0;
        for (String A : tmp) {
            answer[i] = A;
            i++;
        }
        return answer;
    }
}