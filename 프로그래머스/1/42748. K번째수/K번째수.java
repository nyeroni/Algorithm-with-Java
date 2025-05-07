import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] ans = new int[commands.length];
        
        for(int i=0; i<commands.length; i++) {
            int []tmp = new int[commands[i][1] - commands[i][0] + 1];
            int k=0;
            for(int j=commands[i][0]-1; j< commands[i][1]; j++) {
                tmp[k++] = array[j];
            }
            Arrays.sort(tmp);
            ans[i] = tmp[commands[i][2]-1];
        }
        return ans;
    }
}