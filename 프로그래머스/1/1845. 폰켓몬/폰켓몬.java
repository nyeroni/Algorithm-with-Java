import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int length = nums.length;
        int []newNums = Arrays.stream(nums).distinct().toArray();
        if(newNums.length >= length/2) {
            answer = length/2;
        }
        else {
            answer = newNums.length;
        }
        return answer;
    }
}