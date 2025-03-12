import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int length = 0;
        Map<String, Integer> wantMap = new HashMap<>();
        for(int i=0; i<want.length; i++) {
            wantMap.put(want[i], number[i]);
            length += number[i];
        }
        
        for(int i=0; i<=discount.length - length; i++) {
            Map<String, Integer> windowMap = new HashMap<>();

            for(int j=i; j<length + i; j++) {
                windowMap.put(discount[j], windowMap.getOrDefault(discount[j], 0) + 1);
            }

            if(wantMap.equals(windowMap)) {
                answer ++;
            }
        }
        
        return answer;
    }
}