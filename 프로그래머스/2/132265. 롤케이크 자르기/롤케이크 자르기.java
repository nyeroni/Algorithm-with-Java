import java.util.*;
class Solution {
    public int solution(int[] topping) {
        Map<Integer, Integer> mapA = new HashMap<>();
        Map<Integer, Integer> mapB = new HashMap<>();
        int answer = 0;
        for(int i=0; i<topping.length; i++) {
           mapB.put(topping[i], mapB.getOrDefault(topping[i], 0) + 1);
        }
        for(int i=0; i<topping.length; i++) {
            mapA.put(topping[i], mapA.getOrDefault(topping[i], 0) + 1);
            if(mapB.get(topping[i]) == 1) {
                mapB.remove(topping[i]);
            } else  mapB.put(topping[i], mapB.getOrDefault(topping[i], 0) - 1);
            if(mapA.size() == mapB.size()) {
                answer ++;
            }
        }
        return answer;
    }
}