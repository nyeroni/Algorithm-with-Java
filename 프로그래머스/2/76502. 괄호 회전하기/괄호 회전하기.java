import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
       for(int i=0; i<s.length(); i++) {
           s += s.charAt(0);
           s = s.substring(1, s.length());
           if(check(s)) answer ++;
       }
        return answer;
    }
    private boolean check(String s) {
        Stack<String> stack = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(') {
                stack.push("(");
            } else if(s.charAt(i) == '[') {
                stack.push("[");

            } else if(s.charAt(i) == '{') {
                stack.push("{");

            } else {
                if(stack.isEmpty()) return false;
                String str = stack.peek();
                if(str.equals("(") && s.charAt(i) == ')') {
                    stack.pop();
                } else if(str.equals("{") && s.charAt(i) == '}') {
                    stack.pop();
                } else if(str.equals("[") && s.charAt(i) == ']') {
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty()) {
            return true;
        } 
        return false;
    }
}