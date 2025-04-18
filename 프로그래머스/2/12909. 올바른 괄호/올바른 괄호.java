import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<String> stack = new Stack<>();
        
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(') {
                stack.push("(");
            }
            else if(!stack.isEmpty() && s.charAt(i) == ')') {
                stack.pop();
            } else if(stack.isEmpty() && s.charAt(i) == ')') {
                return false;
            }
        }
        if(stack.isEmpty()) {
            return true;
        } 

        return false;
    }
}