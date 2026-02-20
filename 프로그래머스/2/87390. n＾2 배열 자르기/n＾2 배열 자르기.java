import java.util.*;
class Solution {
    public int[] solution(int n, long left, long right) {
        // 00 1 0
        // 01 2 1
        // 02 3 2
        // 03 4 3
        // 10 2 4
        // 11 2 5
        // 12 3 6
        // 13 4 7
        // 20 3 8
        // 21 3 9
        // 22 3 10
        // 23 4 11
        // 30 4 12
        // 31 4 13
        // 32 4 14
        // 33 4 15
        
        // 1234 2234 3334 4444
        // 최대값 + 1 ??
        int startA = (int)(left / (long)n);
        int startB = (int)(left / (long)n);
        int endA = (int)(right / (long)n);
        int endB = (int)(right / (long)n);

        int[] answer = new int[(int)(right - left) + 1];
        for(long i=left; i<=right; i++) {
            int a = (int)(i / (long)n);
            int b =(int)(i % (long)n);
            int max = Math.max(a, b);
            answer[(int)(i-left)] = max + 1;
        }
        return answer;
    }
}