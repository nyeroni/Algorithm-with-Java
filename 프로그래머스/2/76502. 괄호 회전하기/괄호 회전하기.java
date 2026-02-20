import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        if(check(s)) answer ++;
        for(int i=1; i<s.length(); i++){
            char c = s.charAt(0);
            s = s.substring(1, s.length());
            s += c;
            if(check(s)) answer ++;
        }
        return answer;
    }
    private boolean check(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c == '[') {
                stack.push('[');
            } 
            if(c == '(') {
                stack.push('(');
            }
            if(c == '{') {
                stack.push('{');
            }
            if(c == ']') {
                if(!stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                } else return false;
            }
            if(c == ')') {
               if(!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                }
                else return false;
            }
            if(c == '}') {
                if(!stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                }
                else return false;  
            }
        }
        if(stack.isEmpty()) return true;
        return false;
    }
}