import java.util.*;

class Solution {
    public int[] solution(long n) {
        int[] answer;
        List<Integer> tmp = new ArrayList<>();

        while(n>0) {
            tmp.add((int)(n%10));
            n/=10;
        }
        answer = tmp.stream().mapToInt(i->i).toArray();
        return answer;
    }
}