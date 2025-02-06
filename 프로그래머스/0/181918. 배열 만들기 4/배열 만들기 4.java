import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] stk;
        List<Integer> tmp = new ArrayList<>();
        int i=0;
        while(true) {
            if(i < arr.length) {
                if(tmp.size() == 0) {
                    tmp.add(arr[i]);
                    i++;
                } else {
                    if(tmp.get(tmp.size()-1) < arr[i]){
                        tmp.add(arr[i]);
                        i++;
                    } else {
                        tmp.remove(tmp.size()-1);
                    }
                }
            } else {
                break;
            }
        }
        i = 0;
        stk = new int[tmp.size()];
        for(int t : tmp) {
            stk[i] = t;
            i++;
        }
        return stk;
    }
}