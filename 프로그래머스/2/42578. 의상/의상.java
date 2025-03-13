import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer=1;
        Map<String, Integer> clothesMap = new HashMap<>();
       
        for(String[] item : clothes) {
            clothesMap.put(item[1], clothesMap.getOrDefault(item[1], 0) + 1);
        }
        for(int count : clothesMap.values()) {
            answer *= (count + 1);
        }
        return answer - 1;
    }
}