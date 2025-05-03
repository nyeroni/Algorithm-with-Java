import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        if(arr.length == 1) return new int[]{-1};
        List<Integer> tmp = new ArrayList<>();
        int min = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        for(int i=0; i<arr.length; i++) {
            if(min != arr[i]) {
                tmp.add(arr[i]);
            }
        }
        if(tmp.size() == 0) {
            return new int[]{-1};
        }
        answer = tmp.stream().mapToInt(i->i).toArray();
        return answer;
    }
}