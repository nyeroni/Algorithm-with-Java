import java.util.*;

class Solution {
    public int solution(String word) {
        int answer = 0;
        List<String> words = new ArrayList<>();
        makeWords("", words);
        return words.indexOf(word);
    }
    public void makeWords(String word, List<String> words) {
        words.add(word);
        if(word.length() == 5) {
            return;
        }
        String [] w = {"A", "E", "I", "O", "U"};
        for(String c : w) {
            makeWords(word+c, words);
        }
    }
}