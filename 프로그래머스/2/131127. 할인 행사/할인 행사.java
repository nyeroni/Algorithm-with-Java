import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int length = 0;
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<want.length; i++) {
            map.put(want[i], number[i]);
            length += number[i];
        }
        for(int i=0; i<=discount.length-length; i++) {
            Map<String, Integer> tmp = new HashMap<>();
            for(int j=i; j<i+length; j++) {
                tmp.put(discount[j], tmp.getOrDefault(discount[j], 0) + 1);
                // System.out.println("discount[j] : " + discount[j] + "tmp.get(discount) : " + tmp.get(discount[j]));
            }
            if(map.equals(tmp)) answer ++;
        }
        return answer;
    }
}