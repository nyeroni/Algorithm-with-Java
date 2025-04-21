import java.util.*;
class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i<dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            // System.out.println("c : " + c );
            if(c >= '0' && c <= '9') {
                if(i != dartResult.length() -1 && c == '1' && dartResult.charAt(i+1) == '0') {
                    i++;
                    stack.push(10);
                } else {
                    int n = Integer.parseInt(String.valueOf(c));
                    stack.push(n); 
                }
            } else if(c == '*') {
                if(stack.size() > 1) {
                    int a = stack.pop();
                    int b = stack.pop();
                    
                    b *= 2;
                    a *= 2;
                    
                    stack.push(b);
                    stack.push(a);
                } else {
                    int a = stack.pop();
                    a *= 2;
                    stack.push(a);
                }
            } else if(c == '#') {
                int a = stack.pop();
                a *= -1;
                stack.push(a);
            } else {
                int s = stack.pop();
                if(c == 'S') {
                    stack.push(s);
                } else if(c == 'D') {
                    s = (int)Math.pow(s, 2);
                    stack.push(s);
                } else if(c == 'T') {
                    s = (int)Math.pow(s, 3);
                    stack.push(s);
                } 
            }
        }
        while(!stack.isEmpty()) {
            int n = stack.pop();
            System.out.println("n : " + n);
            answer += n;
        }
        return answer;
    }
}