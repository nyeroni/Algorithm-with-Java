import java.util.*;
class Solution {
    public int[] solution(int n, long left, long right) {
        int size = (int) (right - left + 1);
        int[] answer = new int[size];
//11 12 13 21 22 23 31 32 33
    //   2  3  4  5
        //3
        for(long idx=left; idx<=right; idx++) {
            int i = (int)(idx/n) + 1;
            int j = (int)(idx%n) + 1;
            answer[(int)(idx-left)] = Math.max(i, j);
        }
      
        return answer;
    }
}