import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[numbers.length];
        for(int i=numbers.length-1; i>=0; i--) {
            int now = numbers[i];
            while(!stack.isEmpty() && stack.peek() <= now) {
                stack.pop();
            }
            answer[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(now);
        }
        return answer;
    }
}