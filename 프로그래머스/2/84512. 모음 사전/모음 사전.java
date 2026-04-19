import java.util.*;

class Solution {
    static String[] str = {"A", "E", "I", "O", "U"};
    static List<String> list = new ArrayList<>();
    public int solution(String word) {
        dfs("");
        for(int i=0; i<list.size(); i++) {
            if(list.get(i).equals(word)) return i+1;
        }
        return 0;
    }
    public void dfs(String word) {
        if(word.length() > 5) {
            return;
        }
        if(!word.equals("")) list.add(word);
        for(String s : str) {
            dfs(word + s);
        }
    }
}