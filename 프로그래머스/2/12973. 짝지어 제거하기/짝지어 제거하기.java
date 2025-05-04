import java.util.*;

class Solution {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        int i = 0;
        while(true) {
            if(i == s.length()) break;
            if(!stack.isEmpty() && s.charAt(i) == stack.peek()) {
                stack.pop();
            } else stack.push(s.charAt(i));
            i++;
        }
        if(stack.isEmpty()) return 1;
        return 0;
    }
}