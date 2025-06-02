import java.util.*;
class Solution {
    public int[] solution(int n, long left, long right) {
        int size = (int)(right - left + 1);
        int[] answer = new int[size];
       
        for(long idx = left; idx<=right; idx++) {
            int i = (int)(idx/n) + 1; //행
            int j = (int)(idx%n) + 1; //열
            
            answer[(int)(idx-left)] = Math.max(i, j);
        }
        return answer;
    }
}