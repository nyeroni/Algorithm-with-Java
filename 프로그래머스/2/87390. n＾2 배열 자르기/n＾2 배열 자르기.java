import java.util.*;
class Solution {
    public int[] solution(int n, long left, long right) {
        // 00 01 02
        // 10 11 12
        // 20 21 22
        
        // 1 2 3
        // 2 2 3
        // 3 3 3
        
        // 00 01 02 10 11 12 20 21 22
        // 0  1  2  3  4  5  6  7  8
        
        int[] arr = new int[(int)(right - left) + 1]; 
        for(long i = left; i <= right; i++) {
            arr[(int)(i-left)] = Math.max((int)(i/n), (int)(i%n)) + 1;
        }
        return arr;
    }
}