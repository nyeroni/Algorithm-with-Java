import java.util.*;
class Solution {
    public int solution(int[] topping) {
        Map<Integer, Integer> A = new HashMap<>();
        Map<Integer, Integer> B = new HashMap<>();
        for(int i=0; i<topping.length; i++) {
            B.put(topping[i], B.getOrDefault(topping[i], 0) + 1);
        }
        int answer = 0;
        for(int i=0; i<topping.length; i++) {
            A.put(topping[i], A.getOrDefault(topping[i], 0) + 1);
            if(B.get(topping[i]) == 1) B.remove(topping[i]);
            else B.put(topping[i], B.getOrDefault(topping[i], 0) - 1);
            if(A.size() == B.size()) answer++;
        }
        return answer;
    }
}