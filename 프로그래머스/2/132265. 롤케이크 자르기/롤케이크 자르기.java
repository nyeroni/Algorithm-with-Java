import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();

        for(int i=0; i<topping.length; i++) {
            int num = topping[i];
            map2.put(num, map2.getOrDefault(num, 0) + 1);
        }
        
        for(int i=0; i<topping.length; i++) {
            int num = topping[i];
            map1.put(num, map1.getOrDefault(num, 0) + 1);
            if(map2.containsKey(num)) {
                if(map2.get(num) == 1) {
                    map2.remove(num);
                } else {
                    map2.put(num, map2.getOrDefault(num, 0)-1);
                }
            }
            if(map2.size() == map1.size()) {
                answer ++;
            }
        }
        return answer;
    }
}