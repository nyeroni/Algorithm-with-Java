import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int round = 0;
        int people = 0;
        List<String> list = new ArrayList<>();
        list.add(words[0]);
        for(int i=1; i<words.length; i++) {
            round = i/n + 1;
            people = i%n + 1;
            if(words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0) || list.contains(words[i])) {
                answer[0] = people;
                answer[1] = round;
                return answer;
            }
            list.add(words[i]);
        }
        return new int[]{0, 0};
    }
}