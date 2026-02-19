import java.util.*;

class Solution {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        int len = elements.length;
        int idx = 0;
        int count = 1;
        while(true) {
            if(idx == len) {
                idx = 0;
                count ++;
            }
            if(count > len) break;
            int sum = 0;
            for(int i=idx; i<idx + count; i++) {
                if(i >= len) {
                    sum += elements[i - len];
                }
                else sum += elements[i];
            }
            set.add(sum);
            idx++;
        }
        return set.size();
    }
}