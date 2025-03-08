import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<String> stack = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(') {
                if(i == s.length() - 1) {
                    return false;
                }
                stack.push("(");
            } else if(s.charAt(i) == ')') {
                if(stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        if(!stack.isEmpty()) {
            return false;
        }
        return true;
    }
}