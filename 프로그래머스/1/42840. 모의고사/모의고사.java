import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        List<Integer> list = new ArrayList<>();
        int scoreOne = 0, scoreTwo = 0, scoreThree = 0;
        for(int i=0; i<answers.length; i++) {
            if(one[i%one.length] == answers[i]) scoreOne ++;
            if(two[i%two.length] == answers[i]) scoreTwo ++;
            if(three[i%three.length] == answers[i]) scoreThree ++;
        }
        int max = Math.max(scoreOne, Math.max(scoreTwo, scoreThree));
        if(max == scoreOne) list.add(1);
        if(max == scoreTwo) list.add(2);
        if(max == scoreThree) list.add(3);
        
        return list.stream().mapToInt(i->i).toArray();
    }
}