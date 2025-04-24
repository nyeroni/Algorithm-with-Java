import java.util.*;

class Solution {
    public int solution(String word) {
        int answer = 0;
        List<String> words = new ArrayList<>();
        makeWord("", words);
        answer = words.indexOf(word);
        return answer;
    }
    public void makeWord(String w, List<String> words) {
        words.add(w);
        String[] str = {"A", "E", "I", "O", "U"};
       if(w.length() == 5)
       {
           return;
       }        
        for(int i=0; i<str.length; i++) {
            makeWord(w + str[i], words);
        }
    }
}