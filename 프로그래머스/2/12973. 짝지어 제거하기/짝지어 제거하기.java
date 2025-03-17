import java.util.*;

class Solution
{
    public int solution(String s)
    {
        Stack<String> stack = new Stack<>();
        String[] str = s.split("");
        
        for(String i : str) {
            if(!stack.isEmpty() && stack.peek().equals(i)) {
                stack.pop();
            }
            else {
                stack.push(i);
            }
        }
        if(stack.isEmpty()) return 1; 
        else return 0;
        
    }
}