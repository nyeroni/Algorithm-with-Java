import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Arrays.sort(tangerine);
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : tangerine) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        //map value 크기로 정렬 ..?
        int[] arr = new int[map.size()];
        int j = 0;
        for(int num : map.keySet()) {
            arr[j] = map.get(num);
            j++;
        }
        int sum = 0;
        Arrays.sort(arr);
        for(int i=arr.length-1; i>=0; i--) {
            sum += arr[i];
            answer ++;
            if(sum >= k) break;
        }
        return answer;
    }
}
