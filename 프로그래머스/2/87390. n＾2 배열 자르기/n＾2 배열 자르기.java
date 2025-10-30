import java.util.*;
class Solution {
    public int[] solution(int n, long left, long right) {
        // 00 -> 1
        // 10 01 11 -> 2
        // 20 21 22 02 12 -> 3
        // 00 01 02 10 11 12 20 21 22
        // 0. 1. 2. 3. 4. 5. 6. 7. 8
        
        int[] answer = new int[(int)(right - left) + 1];
        
        for(long i=left; i<=right; i++) {
            int a = (int)(i/(long)n);
            int b = (int)(i%(long)n);
            int max = Math.max(a, b) + 1;
            answer[(int)(i-left)] = max;
        }
        return answer;
        
    }
}