import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        List<String> list = new ArrayList<>();
        int a=0, b=0;
        char c = 'a';
        for(int i=0; i<words.length; i++) {
            if(!list.contains(words[i])) {
                if(i != 0 && c != words[i].charAt(0)) {
                    a = i%n + 1;
                    b = i/n + 1;
                    break;
                }
                c = words[i].charAt(words[i].length()-1);
                list.add(words[i]);
            } else {
                a = i%n + 1;
                b = i/n + 1;
                break;
            }
        }
        return new int[]{a, b};
    }
}