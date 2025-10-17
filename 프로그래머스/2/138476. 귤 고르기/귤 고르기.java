import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Arrays.sort(tangerine);
        //[1, 2, 2, 3, 3, 4, 5, 5] -> 4
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<tangerine.length; i++) {
            map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) + 1);
        }
        //map의 value 정렬은 어떻게?
        
        List<Integer> list = new ArrayList<>();
        
        for(int num : map.keySet()) {
            list.add(map.get(num));
        }
        
        Collections.sort(list);
        Collections.reverse(list);
        for(int num : list) {
            k-=num;
            answer++;
            if(k<=0) {
                break;
            }
        }
        return answer;
    }
}
