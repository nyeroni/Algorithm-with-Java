import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer;
        List<Integer> tmp = new ArrayList<>();
        for(int i=0; i<n; i++) {
            tmp.add(num_list[i]);
        }
        answer = new int[tmp.size()];
        int i=0;
        for(int a : tmp) {
            answer[i] = a;
            i++;
        }
        return answer;
    }
}