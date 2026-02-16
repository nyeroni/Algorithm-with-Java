import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<tangerine.length; i++) {
            map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) + 1);
        }
        int[] arr = new int[map.size()];
        int j=0;
        for(Integer num : map.keySet()) {
            arr[j] = map.get(num);
            j++;
        }
        Arrays.sort(arr);
        int sum = 0, answer = 0;
        for(int i=arr.length-1; i>=0; i--) {
            sum += arr[i];
            answer ++;
            if(sum >= k) break;
        }
        return answer;
    }
}
