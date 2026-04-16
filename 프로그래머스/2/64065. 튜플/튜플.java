import java.util.*;

class Solution {
    public int[] solution(String s) {
        Map<Integer, Integer> map = new HashMap<>();
        s = s.substring(2, s.length()-2);
        String[] str = s.split("\\},\\{");
        for(String ss : str) {
            String[] tmp = ss.split(",");
            for(String t : tmp) {
                int num = Integer.parseInt(t);
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        int len = str.length;
        int[] answer = new int[len];
        for(int m : map.keySet()) {
            answer[len - map.get(m)] =  m;
        }
        return answer;
    }
}