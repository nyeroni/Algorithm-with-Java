import java.util.*;
class Solution {
    public int solution(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        
        for(int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        int answer = 0;
        answer = map.size();
        if(answer > len/2) {
            answer = len/2;
        }
        return answer;
    }
}