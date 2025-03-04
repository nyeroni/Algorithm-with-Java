import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer;
        List<Integer> tmp = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            if(arr[i] % divisor == 0) {
                tmp.add(arr[i]);
            }
        }
        Collections.sort(tmp);
        if(tmp.size()==0) {
            tmp.add(-1);
        }
        answer = tmp.stream().mapToInt(i->i).toArray();
        return answer;
    }
}