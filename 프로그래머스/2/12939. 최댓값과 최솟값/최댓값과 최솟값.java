import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String []tmp = s.split(" ");
        int [] arr = new int[tmp.length];
        int i=0;
        for(String str : tmp) {
            arr[i] = Integer.parseInt(str);
            i++;
        }
        Arrays.sort(arr);
        answer += arr[0]; 
        answer += " ";
        answer += arr[arr.length - 1];
        return answer;
    }
}