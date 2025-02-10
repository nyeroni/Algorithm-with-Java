import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer;
        List<Integer> tmp = new ArrayList<>();
        
        for(int i=intervals[0][0]; i<=intervals[0][1]; i++) {
            tmp.add(arr[i]);
        }
        for(int i=intervals[1][0]; i<=intervals[1][1]; i++) {
            tmp.add(arr[i]);
        }
        answer = tmp.stream().mapToInt(i->i).toArray();
        return answer;
    }
}