import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[prices.length];
        for(int i=0; i<answer.length; i++) {
            answer[i] = answer.length - i - 1;
        }
        for(int i=0; i<prices.length; i++) {
            while(!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
                int idx = stack.pop();
                answer[idx] = i - idx;
            }
            stack.push(i);
        }
        
        return answer;
    }
}