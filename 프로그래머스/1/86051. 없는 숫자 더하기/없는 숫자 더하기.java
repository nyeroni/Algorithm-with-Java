import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        for(int num : numbers) {
            list.add(num);
        }
        for(int i=0; i<=9; i++) {
            if(!list.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }
}