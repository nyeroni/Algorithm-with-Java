import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int t : tangerine) {
            map.put(t, map.getOrDefault(t, 0) + 1);
        }
        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);
        int answer = 0;
        for(int i=list.size()-1; i>=0; i--) {
            k-=list.get(i);
            answer ++;
            if(k <= 0) return answer;
        }
        return answer;
    }
}
