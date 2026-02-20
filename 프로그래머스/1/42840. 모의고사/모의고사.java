import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int answer1 = 0, answer2 = 0, answer3 = 0;
        for(int i=0; i<answers.length; i++) {
            if(one[i%5] == answers[i]) {
                answer1++;
            }
            if(two[i%8] == answers[i]) {
                answer2++;
            }
            if(three[i%10] == answers[i]) {
                answer3++;
            }
        }
        List<Integer> list = new ArrayList<>();
        int max = Math.max(answer1, answer2);
        max = Math.max(max, answer3);
        if(max == answer1) list.add(1);
        if(max == answer2) list.add(2);
        if(max == answer3) list.add(3);

        return list.stream().mapToInt(i->i).toArray();
    }
}