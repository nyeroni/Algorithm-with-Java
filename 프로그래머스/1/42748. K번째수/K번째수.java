import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0; i<commands.length; i++) {
            int start = commands[i][0]-1;
            int end = commands[i][1]-1;
            int num = commands[i][2]-1;
            int k=0;
            int[] tmp = new int[end-start+1];
            for(int j=start; j<=end; j++) {
                tmp[k] = array[j];
                k++;
            }
            Arrays.sort(tmp);
            answer[i] = tmp[num];
        }
        return answer;
    }
}