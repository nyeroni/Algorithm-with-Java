import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer;
        List<Integer> tmp = new ArrayList<>();
        for(int i=0; i<flag.length; i++) {
            if(flag[i]) {
                for(int j = 0; j<arr[i]*2; j++) {
                    tmp.add(arr[i]);
                }
            } else {
                for(int j=0; j<arr[i]; j++) {
                    tmp.remove(tmp.size()-1);
                }
            }
        }
        answer = tmp.stream().mapToInt(i->i).toArray();
        return answer;
    }
}