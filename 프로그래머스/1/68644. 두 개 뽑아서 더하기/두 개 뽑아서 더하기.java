import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer;
        Set<Integer> tmp = new HashSet<>();
        for(int i=0; i<numbers.length; i++) {
            for(int j=0; j<numbers.length; j++) {
                if(i != j) {
                    tmp.add(numbers[i] + numbers[j]);
                }
            }
        }
        int i=0;
        answer = new int[tmp.size()];
        for(int t : tmp) {
            answer[i++] = t;
        }
        Arrays.sort(answer);
        return answer;
    }
}