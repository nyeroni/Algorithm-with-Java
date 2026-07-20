import java.util.Stack;

class Solution {
    public boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c == '(') {
                stack.push('(');
            } else if(c == ')') {
                if(stack.isEmpty()) return false;
                if(stack.peek() == '(') {
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty()) return true;
        return false;
    }
}