import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0, right = people.length-1;
        int answer = 0;
        while(left <= right) {
            if(people[left] + people[right] <= limit) {
                left ++;
            }
            answer ++;
            right --;
            // 50 50 70 80
        }
        return answer;
    }
}