import java.util.*;
class Solution {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        
        Stack<Character> stack = new Stack<>();
        int cnt = 0;
        
        for(char c : number.toCharArray()) {
            while(!stack.isEmpty() && stack.peek() < c && cnt < k) {
                cnt ++;
                stack.pop();
            }
            stack.push(c);
        }
        while(cnt < k) {
            stack.pop();
            cnt ++;
        }
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}