import java.util.*;
class Solution {
    public int solution(int[] order) {
       Stack<Integer> stack = new Stack<>();
        int answer = 0;
        int num = 1;
        int i=0;
        while(i < order.length) {
            if(stack.isEmpty() || num <= order[i]) {
                stack.push(num++);
            }
            else if(stack.peek() == order[i]) {
                answer ++;
                stack.pop();
                i++;
            } else {
                break;
            }
        }
        return answer;
    }
}