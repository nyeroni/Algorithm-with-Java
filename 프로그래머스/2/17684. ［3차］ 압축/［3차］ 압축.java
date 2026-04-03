import java.util.*;
class Solution {
    static Map<String, Integer> map = new HashMap<>();
    static List<Integer> list = new ArrayList<>();
    public int[] solution(String msg) {
        int idx = 1;
        for(int i=0; i<26; i++) {
           String c = String.valueOf((char)('A' + i));
           map.put(c, idx);
           idx ++;
        }
        int i = 0;
        while(i < msg.length()) {
            String w = String.valueOf(msg.charAt(i));
            int j = i+1;
            while(j <= msg.length() && map.containsKey(msg.substring(i, j))) {
                w = msg.substring(i, j);
                j++;
            }
            list.add(map.get(w));
            if(j <= msg.length()) {
                map.put(msg.substring(i, j), idx++);
            }
            i += w.length();
        }
        
        return list.stream().mapToInt(k->k).toArray();
    } 
}