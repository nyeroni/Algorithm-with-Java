import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] arr = new int[s.length()];
    
        for(int i=s.length()-1; i>=1; i--) {
            char c = s.charAt(i);
            arr[i] = -1;
            for(int j=i-1; j>=0; j--) {
                if(c == s.charAt(j)) {
                    arr[i] = i - j;
                    break;
                }
            }
        }
        arr[0] = -1;
 
        return arr;
    }
}