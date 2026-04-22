import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        List<Character> list = new ArrayList<>();
        for(String sk : skip.split("")) {
            list.add(sk.charAt(0));
        }
        for(char c : s.toCharArray()) {
            int count = 0, idx = 1;
            char next = ' ';
            while(count < index) {
                next = (char) (((c -'a' + idx) % 26) + 'a');
                if(!list.contains(next)) {
                    count ++;
                }
                idx ++;
            }
            sb.append(next);
        }
        return sb.toString();
    }
}