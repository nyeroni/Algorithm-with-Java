import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer;
        for(int i=0; i<arr.length-1; i++) {
            if(arr[i] == arr[i+1]) {
                arr[i] = -1;
                i--;
            }
        }
        int k = 0;
        List<Integer> tmp = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != -1) {
                tmp.add(arr[i]);
            }
        }
        answer = new int[tmp.size()];
        for(int t : tmp) {
            answer[k] = t;
            k++;
        }
        return answer;
    }
}