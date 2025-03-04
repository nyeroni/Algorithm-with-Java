import java.util.*;
class Solution {
    public long[] solution(int x, int n) {
        long[] answer;
        List<Long> tmp = new ArrayList<>();
        for(int i=1; i<=n; i++) {
            tmp.add((long)x*i);
        }
        answer = tmp.stream().mapToLong(i -> i).toArray();
        return answer;
    }
}