import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) {
            return new int []{-1};
        }
        int[] answer = new int[arr.length-1];
        int [] tmp = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
            tmp[i] = arr[i];
        }
        Arrays.sort(tmp);
        int min = tmp[0];
        int j=0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == min) {
                continue;
            } else {
                answer[j] = arr[i];
                j++;
            }
        }
        return answer;
    }
}