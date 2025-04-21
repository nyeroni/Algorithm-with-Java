import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
       int [] answer = new int[numbers.length];
        Stack<Integer> stack = new Stack<>();
        int idx = numbers.length-1;
        answer[idx --]  = -1;
        for(int i=numbers.length-2; i>=0; i--) {
            if(numbers[i] < numbers[i+1]) {
                stack.push(numbers[i+1]);
                answer[idx--] = numbers[i+1];
                continue;
            } else {
                boolean flag = false;
                while(!stack.isEmpty()) {
                    int num = stack.peek();
                    if(num > numbers[i]) {
                        flag = true;
                        answer[idx--] = num;
                        break;
                    }
                    else {
                        stack.pop();
                    }
                }
                if(!flag) {
                    answer[idx --]  = -1;
                }
            }
        }
        return answer;
    }
}