import java.util.*;

class Solution {
    static List<String> list = new ArrayList<>();
    static String[] vowels = {"A", "E", "I", "O", "U"};
    public int solution(String word) {
       dfs("");
        for(int i=0; i<list.size(); i++) {
            if(list.get(i).equals(word)) return i+1;
        }
        return 0;
    }
    private void dfs(String current) {
        if(current.length() > 5) return;
        if(!current.equals("")) {
            list.add(current);
        }
        for(String vowel : vowels) {
            dfs(current + vowel);
        }
    }
}