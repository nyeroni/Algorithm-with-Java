import java.util.*;
class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        int idx = 0;
        for(long num : numbers) {
            if(num % 2 == 0) {
                answer[idx++] = num + 1;
            } else {
                answer[idx++] = (num + 1) + ((num ^ (num+1)) >> 2);
            }
        }
        return answer;
    }
}