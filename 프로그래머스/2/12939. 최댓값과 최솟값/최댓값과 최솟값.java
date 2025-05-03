import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");
        List<Integer> tmp = new ArrayList<>();
        for(String st : str) {
            if(st.length() == 2) {
                tmp.add(Integer.parseInt(String.valueOf(st.charAt(1))) * -1);
            } else {
                tmp.add(Integer.parseInt(st));
            }
        }
        Collections.sort(tmp);
        answer += String.valueOf(tmp.get(0));
        answer += " ";
        answer += String.valueOf(tmp.get(tmp.size()-1));
        return answer;
    }
}