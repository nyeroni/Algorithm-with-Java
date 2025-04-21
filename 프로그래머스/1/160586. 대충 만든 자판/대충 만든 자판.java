import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<keymap.length; i++) {
            for(int j=0; j<keymap[i].length(); j++) {
                String s = String.valueOf(keymap[i].charAt(j));
                int m = map.getOrDefault(s, -1);
                int min = j+1;
                if(m != -1) {
                    min = Math.min(m, j+1);
                }
                map.put(s, min);
            }
        }
        for(int i=0; i<targets.length; i++ ){
            int result = 0;
            for(int j=0; j<targets[i].length(); j++) {
                String s = String.valueOf(targets[i].charAt(j));
                if(map.containsKey(s)) {
                    int m = map.getOrDefault(s, -1);
                    result += m;
                } else {
                    result = -1;
                    break;
                }
            }
            answer[i] = result;
        }
        return answer;
    }
}