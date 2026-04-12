import java.util.*;

class Solution {
    public long solution(long n) {
        String[] answer = String.valueOf(n).split("");
        Arrays.sort(answer, Collections.reverseOrder());
        String str = String.join("", answer);
        return Long.parseLong(str);
    }
}