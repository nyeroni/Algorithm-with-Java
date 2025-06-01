import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int m = 0;
        for(int i=people.length-1; i>=m; i--) {
            if(people[i] + people[m] <= limit) {
                m++;
            }
            answer ++;
        }
        return answer;
    }
}