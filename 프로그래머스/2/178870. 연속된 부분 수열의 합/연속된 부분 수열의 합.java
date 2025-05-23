import java.util.*;
class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int n = sequence.length;
        
        int sum  = 0;
        int a = 0;
        int minLength = Integer.MAX_VALUE;
        
        for(int b=0; b<n; b++) {
            sum += sequence[b];
            while(sum > k && a <= b) {
                sum -= sequence[a];
                a++;
            }
            if(sum == k && b - a < minLength) {
                minLength = b-a;
                answer[0] = a;
                answer[1] = b;
            }
        }
        return answer;
    }
}