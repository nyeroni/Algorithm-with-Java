import java.util.*;

class Solution {
    public int[] solution(int n, int s) {
        int[] answer = new int[n];
        int a = s/n;
        int b = s%n;
        
        // 9 / 2 = 4
        // 9 % 2 = 1
        if(a == 0) return new int[]{-1}; 
        for(int i=n-1; i>=0; i--) {
            if(b > 0)
                answer[i] = a + 1;
            else answer[i] = a;
            b--;
        }
        //11115
        //11124
        //11133
        //11223 = 12
        //12222 = 15
        //9/5 = 1
        // 9%5 = 4
        
        return answer;
    }
}