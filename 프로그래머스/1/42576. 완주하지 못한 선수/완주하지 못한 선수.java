import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        for(String s : participant) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for(String c : completion) {
            map.put(c, map.getOrDefault(c, 0) - 1);
        }
        for(String s : map.keySet()) {
            if(map.get(s) > 0) {
                return s;
            }
        }
        return "";
    }
}