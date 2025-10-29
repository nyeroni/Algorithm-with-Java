import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] tmp = s.split(" ");
        int[] arr = new int[tmp.length];
        
        for(int i=0; i<tmp.length; i++) {
            arr[i] = Integer.parseInt(tmp[i]);
        }
        Arrays.sort(arr);
        answer = arr[0] + " " + arr[arr.length-1];
        return answer;
    }
}