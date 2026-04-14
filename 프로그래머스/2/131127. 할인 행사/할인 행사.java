import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<10; i++){
            map.put(discount[i], map.getOrDefault(discount[i], 0) + 1);
        }
        int cnt = 0;
        for(int j=0; j<want.length; j++) {
            if(map.getOrDefault(want[j], 0) >= number[j]) cnt ++;
        }
        if(cnt == want.length) answer ++;
        for(int i=10; i<discount.length; i++) {
            cnt = 0;
            map.put(discount[i-10], map.getOrDefault(discount[i-10], 0) - 1);
            map.put(discount[i], map.getOrDefault(discount[i], 0) + 1);
            for(int j=0; j<want.length; j++) {
                if(map.getOrDefault(want[j], 0) >= number[j]) cnt ++;
            }
            if(cnt == want.length) answer ++;
        }
        return answer;
    }
}