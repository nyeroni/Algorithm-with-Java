import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer;
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<numbers.length-1; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        answer = new int[set.size()];
        int k=0;
        for(Integer i : set) {
            answer[k] = i;
            k++;
        }
        Arrays.sort(answer);
        return answer;
    }
}