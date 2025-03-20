import java.util.*;
class Solution {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        int cnt = 0;
        for(char c : number.toCharArray()) {
            while(!stack.isEmpty() && stack.peek() < c && cnt < k) {
                cnt++;
                stack.pop();
            }
            stack.push(c);
        }
        while(cnt<k) {
            stack.pop();
            cnt++;
        }
        while(!stack.isEmpty()) {
            answer.append(stack.pop());
        }
        return answer.reverse().toString();
    }
}