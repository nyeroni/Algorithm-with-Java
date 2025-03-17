import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> tan = new HashMap<>();
        for(int i=0; i<tangerine.length; i++) {
            tan.put(tangerine[i], tan.getOrDefault(tangerine[i], 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(tan.entrySet());

        entryList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        Map<Integer, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        int sum =0 ;
        for(int value : sortedMap.values()) {
            sum += value;
            answer ++;
            if(sum >= k) {
                break;
            }
        }
        return answer;
    }
}