import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Set<Integer> set = new LinkedHashSet<>();
        
        for (int num : arr) {
            set.add(num);
            if (set.size() == k) break;
        }
        
        List<Integer> list = new ArrayList<>(set);
        
        for (int i = 0; i < k; i++) {
            answer[i] = (i < list.size()) ? list.get(i) : -1;
        }
        
        return answer;
    }
}
