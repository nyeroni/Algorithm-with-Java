import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {0};
        Map<Integer, Integer> map = new LinkedHashMap<>();
        List<Integer> tmp = new ArrayList<>();
        for(int i=0; i<progresses.length; i++) {
            int days = 0;
            if((100 - progresses[i])%speeds[i] == 0) {
                days = (100 - progresses[i])/speeds[i];

            } else {
                days = (100 - progresses[i])/speeds[i] + 1;

            }
        
            if(!map.isEmpty() && tmp.get(tmp.size()-1) > days) {
                days = tmp.get(tmp.size()-1);
            }   
            tmp.add(days);
            map.put(days, map.getOrDefault(days, 0) + 1);
        }
        List<Integer> ansTmp = new ArrayList<>();
        for(Integer value : map.values()) {
            ansTmp.add(value);
        }
        answer = ansTmp.stream().mapToInt(i->i).toArray();
        return answer;
    }
}