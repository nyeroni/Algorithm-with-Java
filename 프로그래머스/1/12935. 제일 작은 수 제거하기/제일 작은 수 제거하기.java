import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int min = Integer.MAX_VALUE;
        for(int a : arr) {
            if(min > a) {
                min = a;
            }
        }
        List<Integer> answer = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == min) {
                continue;
            }
            answer.add(arr[i]);
        }
        if(answer.size() == 0) {
            answer.add(-1);
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}