import java.util.*;

class Solution {
    public String solution(String p) {
        if(p.length() == 0) return "";
        if(check(p)) return p;
        return calculate(p);
    }
    public String calculate(String s) {
        // System.out.println("s : " + s);
        if(s.equals("")) return "";
        if(check(s)) return s;
        int a = 0, b = 0;
        String u = "", v = "";
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(') a++;
            if(c == ')') b++;
            if(a == b) {
                u = s.substring(0, i+1);
                v = s.substring(i+1, s.length());
                // System.out.println("u : " + u + ", v : " + v);
                if(check(u)) {
                    return u + calculate(v);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("(");
                    sb.append(calculate(v));
                    sb.append(")");
                    //(())
                    // System.out.println("-=-" + sb.toString());
                    if(u.length() <= 2) u = "";
                    else u = u.substring(1, u.length()-1);
                    u = change(u);
                    // System.out.println("u : " + u);
                    // ()
                    sb.append(u); 
                    // System.out.println(">< : " + sb.toString());
                    return sb.toString();
                }
            }
        }
        return "";
    }
    public String change(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()) {
            if(c == '(') {
                sb.append(")");   
            } else if(c==')')
                sb.append("(");
        }
        return sb.toString();
    }
    public boolean check(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c == ')') {
                if(!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else return false;
            }
            else if(c == '(') {
                stack.push('(');
            }
        }
        if(stack.isEmpty()) return true;
        return false;
    }
}