import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int k=0;
        for(int[] command : commands) {
            int[] arr = new int[command[1] - command[0] + 1];
            for(int i=command[0]-1; i<command[1]; i++) {
                arr[i-(command[0]-1)] = array[i];
            }
            Arrays.sort(arr);
            answer[k++] = arr[command[2]-1];
        }
        return answer;
    }
}