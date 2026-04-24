import java.util.*;

class Solution {
    public int[] solution(int[] sequence, int k) {
        int left = 0;
        int right = 0;
        int sum = 0;
        
        int bestStart = 0;
        int bestEnd = sequence.length-1;
        int bestLen = sequence.length;
        while(true) {
            if(sum < k) {
                if(right == sequence.length) break;
                sum += sequence[right++];
            } else if(sum > k) {
                sum -= sequence[left++];
            } else {
                int len = right - left;
                if(len < bestLen) {
                    bestStart = left;
                    bestEnd = right-1;
                    bestLen = len;
                }
                sum -= sequence[left++];
            }
        }
        return new int[]{bestStart, bestEnd};
    }
}