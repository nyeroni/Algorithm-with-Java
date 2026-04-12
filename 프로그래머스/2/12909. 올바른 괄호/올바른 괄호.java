import java.util.Stack;

class Solution {
    public boolean solution(String s) {
        Stack<String> stack = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == ')') {
                if(stack.isEmpty()) return false;
                if(stack.peek().equals("(")) {
                    stack.pop();
                }
            } else if(s.charAt(i) == '(') {
                stack.push("(");
            }
        }
        if(stack.isEmpty()) return true;
        return false;
    }
}