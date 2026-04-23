import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        String[] nums = new String[numbers.length];
        for(int i=0; i<numbers.length; i++) {
            nums[i] = "" + numbers[i];
        }
        Arrays.sort(nums, (a, b) -> (b+a).compareTo(a+b));
        for(String s : nums) {
            sb.append(s);
        }
        if(sb.charAt(0) == '0') return "0";
        return sb.toString();
    }
}