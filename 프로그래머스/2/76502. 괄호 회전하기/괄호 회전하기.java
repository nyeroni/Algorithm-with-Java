import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        // if(calculate(s)) answer ++;
        int cnt = 0;
        while(cnt < s.length()) {
            // System.out.println(" s : " + s);
            // System.out.println("calculate(s) :" + calculate(s));
            if(calculate(s)) answer ++;
            char c = s.charAt(0);
            s = s.substring(1, s.length());
            s += c;
            cnt ++;
        }
        return answer;
    }
    private boolean calculate(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c == '(') stack.push('(' );
            else if (c == ')') {
                if(!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else return false;
            } 
            if(c == '[') stack.push('[' );
            else if (c == ']') {
                if(!stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                } else return false;
            } 
            if(c == '{') stack.push('{' );
            else if (c == '}') {
                if(!stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                } else return false;
            } 
        }
        if(stack.isEmpty()) return true;
        return false;
    }
}