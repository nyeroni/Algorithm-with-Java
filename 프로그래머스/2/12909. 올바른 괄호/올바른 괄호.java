import java.util.Stack;

class Solution {
    public boolean solution(String s) {
        boolean flag = false;
        Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray()) {
            if(c=='(') {
                stack.push('(');
            } else if(c == ')') {
                if(!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else return false;
            }
        }
        if(stack.isEmpty()) return true;
        return false;
    }
}