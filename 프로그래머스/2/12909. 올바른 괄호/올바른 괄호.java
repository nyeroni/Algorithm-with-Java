import java.util.Stack;

class Solution {
    public boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == ')') {
                if(!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else return false;
            } else stack.push('(');
        }
        if(stack.isEmpty()) return true;
        return false;
    }
}