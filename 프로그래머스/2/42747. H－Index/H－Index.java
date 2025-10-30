import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        // 0 1 3 5 6
        int length = citations.length;
        while(length > answer) {
            System.out.println("answer : " + answer);
            if(citations[length - answer-1] <= answer) {
                break;
            }
            answer ++;
        }
        return answer;
    }
}