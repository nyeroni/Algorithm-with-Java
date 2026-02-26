import java.util.*;

class Solution {
    public int[] solution(String s) {
        s = s.substring(2, s.length()-2);
        String[] str = s.split("\\},\\{");
        int[] answer = new int[str.length];
        Map<String, Integer> map = new HashMap<>();
        for(String ss : str) {
            String[] tmp = ss.split(",");
            for(String t : tmp) {
                map.put(t, map.getOrDefault(t, 0) + 1);
            }
        }
        
        for(String key : map.keySet()) {
            answer[str.length - map.get(key)] = Integer.parseInt(key);
        }
        
        return answer;
    }
}