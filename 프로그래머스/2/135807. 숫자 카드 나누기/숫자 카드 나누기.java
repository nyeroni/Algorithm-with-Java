import java.util.*;

class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);
        int min = Math.max(arrayA[0], arrayB[0]);
        
        int idx = 2;
        int cntA = 0, cntB = 0;
        
        while(idx <= min) {
            cntA = 0; cntB = 0;
            // System.out.println("idx :" + idx);
            for(int i=0; i<arrayA.length; i++) {
                if(arrayA[i] % idx == 0 && arrayB[i] % idx != 0) {
                    cntA ++;
                } else if(arrayB[i] % idx == 0 && arrayA[i] % idx != 0) {
                    cntB ++;
                } else break;
            }
            if(cntA == arrayA.length || cntB == arrayA.length) {
                // System.out.println("answer :" + idx);
                answer = idx;
            }
            idx ++;
        }
        
        return answer;
    }
}