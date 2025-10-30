import java.util.*;

class Solution {
    public int solution(String word) {
        int answer = 0;
        List<String> list = new ArrayList<>();
        makeWord("", list);
        answer = list.indexOf(word);
        return answer;
    }
    private void makeWord(String w, List<String> list) {
        list.add(w);
        String[] str = {"A", "E", "I", "O", "U"};
        if(w.length() == 5) return;
        for(int i=0; i<str.length; i++) {
            makeWord(w + str[i], list);
        }
    }
}