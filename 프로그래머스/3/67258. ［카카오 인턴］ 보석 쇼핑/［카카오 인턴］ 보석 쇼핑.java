import java.util.*;

class Solution {
    public int[] solution(String[] gems) {
        Map<String, Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        int left = 0; int right = 0;
        for(String g : gems) {
            set.add(g);
        }
        int answerLeft = 0, answerRight = 0, min = Integer.MAX_VALUE;
        List<int[]> list = new ArrayList<>();
        while(right < gems.length) {
            map.put(gems[right], map.getOrDefault(gems[right], 0) + 1);
            right ++;
            while(map.size() == set.size()) {
                int len = right - left;
                if(min > len) {
                    min = len;
                    answerLeft = left;
                    answerRight = right-1;
                }
                map.put(gems[left], map.get(gems[left])-1);
                if(map.get(gems[left]) == 0) map.remove(gems[left]);
                left ++;
            }
         }
       
        return new int[]{answerLeft + 1, answerRight+1};
    }
}