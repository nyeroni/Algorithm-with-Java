import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        for(int i : arr) {
            if(stack.isEmpty() || stack.peek() != i) {
                stack.push(i);
                list.add(i);
            }
            else {
                stack.push(i);
           }
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}