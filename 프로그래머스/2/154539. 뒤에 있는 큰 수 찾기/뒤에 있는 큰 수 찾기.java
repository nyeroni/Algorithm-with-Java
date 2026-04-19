import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Arrays.fill(answer, -1);
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<numbers.length; i++) {
            while(!stack.isEmpty()) {
                int idx = stack.peek();
                if(numbers[i] > numbers[idx]) {
                    answer[idx] = numbers[i];
                    stack.pop();
                } else break;
            }
            stack.push(i);
        }
        return answer;
    }
}