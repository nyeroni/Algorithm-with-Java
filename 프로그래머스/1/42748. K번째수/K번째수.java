import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int [] ans = new int[commands.length];
        for(int i=0; i<commands.length; i++) {
            int a = commands[i][0];
            int b = commands[i][1];
            int []tmp = new int[b - a + 1];
            int k=0;
            for(int j=a-1; j<b; j++) {
                tmp[k++] = array[j];
            }
            Arrays.sort(tmp);
            ans[i] = tmp[commands[i][2]-1];
        }
        return ans;
    }
}