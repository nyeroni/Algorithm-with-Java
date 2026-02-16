import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int answer = 0;
        int sum = 0;
        int s = 0, e = people.length-1;
        while(s <= e) {
            sum = people[s];
            sum += people[e];
            if(sum > limit) {
                e--;
            } else {
                s++;
                e--;
            }
            answer ++;
        }
        return answer;
    }
}