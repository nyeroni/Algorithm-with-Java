import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        List<String> check = new ArrayList<>();
        check.add(words[0]);
        for(int i=1; i<words.length; i++) {
            if(!check.contains(words[i]) && words[i-1].charAt(words[i-1].length()-1) == words[i].charAt(0)) {
                check.add(words[i]);
            } else {
                int a = (i + 1) % n;
                int b = (i + 1) / n;
                if(a != 0) b++;
                if(a == 0) a = n;
                return new int[]{a, b};
            }
        }
        return new int[]{0, 0};
    }
}