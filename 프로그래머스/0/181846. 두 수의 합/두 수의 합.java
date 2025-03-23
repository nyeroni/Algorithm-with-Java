import java.util.*;

class Solution {
    public String solution(String a, String b) {
        String answer = "";
        Stack <String> stack = new Stack<>();
        int i=a.length()-1;
        int j=b.length()-1;
        int carry = 0;

        while(i>=0 || j>=0 || carry != 0) {
            int num1 = (i >= 0) ? a.charAt(i--) - '0' : 0;
            int num2 = (j >= 0) ? b.charAt(j--) - '0' : 0;
            
            int sum = num1 + num2 + carry;
            carry = sum / 10;
            sum = sum % 10;
            stack.push(String.valueOf(sum));
        }
        while(!stack.isEmpty()) {
            answer += stack.pop();
        }
        return answer;
    }
}