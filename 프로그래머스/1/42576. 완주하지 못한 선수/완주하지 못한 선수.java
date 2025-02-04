import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<completion.length; i++ ) 
        {
            String p = participant[i];
            String c = completion[i];
            map.put(p, map.getOrDefault(p, 0) + 1);
            map.put(c, map.getOrDefault(c, 0) - 1);
        }
        String p = participant[participant.length-1];
        
        map.put(p, map.getOrDefault(p, 0) + 1);
        
        for(String str : map.keySet()) {
            if(map.get(str) == 1) {
                answer = str;
            }
        }
        
        return answer;
    }
}