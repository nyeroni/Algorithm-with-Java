import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        boolean[] flag = new boolean[10];
        for(int i=0; i<numbers.length; i++) {
            flag[numbers[i]] = true;
        }
        int answer = 0;
        for(int i=0; i<flag.length; i++) {
            if(!flag[i]) {
                answer += i;
            }
        }
        return answer;
    }
}