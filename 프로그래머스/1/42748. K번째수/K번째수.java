import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int h=0; h<commands.length; h++) {
            int i = commands[h][0];
            int j = commands[h][1];
            int k = commands[h][2];
            int num = j-i+1;
            int []newArr = new int[num];
            int f=0;
            for(int g=i-1; g<j; g++) {
                newArr[f] = array[g] ;
                f++;
            }
            Arrays.sort(newArr);
            answer[h] = newArr[k-1];
        }
        return answer;
    }
}