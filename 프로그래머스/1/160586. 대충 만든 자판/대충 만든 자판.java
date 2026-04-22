import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        Map<Character, Integer> map = new HashMap<>();
        for(String s : keymap) {
            for(int i = 0; i<s.length(); i++) {
                if(map.containsKey(s.charAt(i)))
                    map.put(s.charAt(i), Math.min(i+1, map.get(s.charAt(i))));
                else map.put(s.charAt(i), i+1);
            }
        }
        int[] answer = new int[targets.length];
        for(int k=0; k<targets.length; k++) {
            int sum = 0;
            boolean flag = false;
            for(int i=0; i<targets[k].length(); i++) {
                if(map.containsKey(targets[k].charAt(i)))
                    sum += map.get(targets[k].charAt(i));
                else flag = true;
            }
            if(!flag) answer[k] = sum;
            else answer[k] = -1;
        }
        return answer;
    }
}