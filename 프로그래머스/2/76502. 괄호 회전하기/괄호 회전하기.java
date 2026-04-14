import java.util.*;

class Solution {
    public int solution(String s) {
        int count = 0;
        if(isCheck(s)) count ++;
        for(int i=1; i<s.length(); i++) {
            char c = s.charAt(0);
            s = s.substring(1, s.length());
            s += c;
            if(isCheck(s)) count ++;
        }
        return count;
    }
    public boolean isCheck(String s) {
        Stack<String> stack = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == ')') {
                if(!stack.isEmpty() && stack.peek().equals("(")) {
                    stack.pop();
                } else return false;
            } else if(s.charAt(i) == '}') {
                if(!stack.isEmpty() && stack.peek().equals("{")) {
                    stack.pop();
                } else return false;
            } else if(s.charAt(i) == ']') {
                if(!stack.isEmpty() && stack.peek().equals("[")) {
                    stack.pop();
                } else return false;
            } else {
                stack.push(String.valueOf(s.charAt(i)));
            }
        }
        if(stack.isEmpty()) return true;
        return false;
    }
}