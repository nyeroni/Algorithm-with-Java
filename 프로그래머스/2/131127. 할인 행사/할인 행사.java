import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        for(int i=0; i<discount.length; i++) {
            Map<String, Integer> tmp = new HashMap<>();
            int count = 0;
            for(int j=i; j<discount.length; j++) {
                if(j-i >= 10 ) break;
                tmp.put(discount[j], tmp.getOrDefault(discount[j], 0) + 1);
            }
            for(int j=0; j<want.length; j++) {
                String s = want[j];
                if(tmp.containsKey(s) && tmp.get(s) >= number[j]) {
                    count ++;
                }
            }
            if(count == want.length) answer ++;
        }
        if(answer == 0) return 0;
        return answer;
    }
}