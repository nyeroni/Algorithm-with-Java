import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        boolean []tmp = new boolean[10];
        for(int i=0; i<numbers.length; i++) {
            tmp[numbers[i]] = true;
        }
        for(int i=0; i<=9; i++) {
            if(!tmp[i]) {
                answer += i;
            }
        }
        return answer;
    }
}