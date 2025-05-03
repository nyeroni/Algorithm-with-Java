import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer;
        List<Integer> tmp = new ArrayList<>();
        
        for(int i=0; i<arr.length-1; i++) {
            if(arr[i] != arr[i+1]) {
                tmp.add(arr[i]);
            }
        }
        tmp.add(arr[arr.length-1]);
        answer = tmp.stream().mapToInt(i->i).toArray();
        return answer;
    }
}