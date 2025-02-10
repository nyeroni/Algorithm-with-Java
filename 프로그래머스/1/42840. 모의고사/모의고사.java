import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer;
        int [] oneAnswer = {1, 2, 3, 4, 5};
        int [] twoAnswer = {2, 1, 2, 3, 2, 4, 2, 5};
        int [] threeAnswer = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int []score = new int[3];
        
        for(int i=0; i<answers.length; i++) {
            if(answers[i] == oneAnswer[i%oneAnswer.length]) {
                score[0] ++;
            }
            if(answers[i] == twoAnswer[i%twoAnswer.length]) {
                score[1] ++;
            } 
            if(answers[i] == threeAnswer[i%threeAnswer.length]) {
                score[2] ++;
            }
        }
        System.out.println(score[0]);
        System.out.println(score[1]);
        System.out.println(score[2]);

        int max = score[0];
        for(int i=1; i<3; i++) {
            if(max < score[i]) {
                max = score[i];
            }
        }
        
        List<Integer> tmp = new ArrayList<>();
        
        for(int i=0; i<3; i++) {
            if(max == score[i]) {
                tmp.add(i+1);
            }
        }
        answer = tmp.stream().mapToInt(i->i).toArray();
        
        return answer;
    }
}