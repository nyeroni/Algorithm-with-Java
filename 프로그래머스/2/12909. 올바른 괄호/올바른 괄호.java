import java.util.Stack;

class Solution {
    public boolean solution(String s) {
        Stack<String> stack = new Stack<>();
        char[] c = s.toCharArray();
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(') {
                stack.push("(");
            } else if(s.charAt(i) == ')') {
                if(!stack.isEmpty() && stack.peek().equals("(")) {
                    stack.pop();
                } else return false;
            }
        }
        System.out.println("stack.size() : " + stack.size());
        if(!stack.isEmpty()) {
            return false;
        }
        return true;
    }
}