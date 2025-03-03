import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        List<Integer> stk = new ArrayList<>();
        int i=0;
        while(true) {
            if(i<arr.length) {
                if(stk.size() == 0) {
                    stk.add(arr[i]);
                    i++;
                } else {
                    if(stk.get(stk.size()-1) == arr[i]) {
                        stk.remove(stk.size()-1);
                        i++;
                    }
                    else {
                        stk.add(arr[i]);
                        i++;
                    }
                }
            } else {
                break;
            }
        }
        if(stk.size() == 0) {
            stk.add(-1);
        }
        answer = stk.stream().mapToInt(j->j).toArray();
        return answer;
    }
}