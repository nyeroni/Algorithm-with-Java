import java.util.*;

class Solution {
    public int solution(int sticker[]) {
        int n = sticker.length;
        if(n==1) return sticker[0];
        return Math.max(getMax(sticker, 0, n-2), getMax(sticker, 1, n-1));
    }
    public int getMax(int[] sticker, int s, int e) {
        int prev1 = 0;
        int prev2 = 0;
        
        for(int i=s; i<=e; i++) {
            int pick = prev2 + sticker[i];
            int skip = prev1;
            
            int current = Math.max(pick, skip);
            
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }
}