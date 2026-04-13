import java.util.*;

class Solution {
    public int solution(int[] elements) {
        // 0 1 2 3 4 0 1 2 3 4
        // i % elements = 0 1 2 3 4 0 1 2 3 4
        Set<Integer> set = new HashSet<>();
        int k = 1;
        int t = 0;
        int sum = 0;
        int len = elements.length;
        while(k <= len) {
            if(t == len) {
                t = 0;
                k++;
            }
            for(int i=t; i<k+t; i++) {
                sum += elements[i%len];
            }
            set.add(sum);
            sum = 0;
            t++;
        }
        return set.size()-1;
    }
}