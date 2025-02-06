import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer;
        List<Integer> tmp = new ArrayList<>();
        for(int i=1; i<=n; i++) {
            if(i%2!=0) {
                tmp.add(i); 
            }
        }
        answer = tmp.stream().mapToInt(i->i).toArray();
        return answer;
    }
}