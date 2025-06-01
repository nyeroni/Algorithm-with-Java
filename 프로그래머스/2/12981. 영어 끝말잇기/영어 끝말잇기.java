import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        answer[0] = 0;
        answer[1] = 0;
        int count = 1;
        char c = words[0].charAt(words[0].length()-1);
        if(words[0].length() == 1) return new int[]{1, 1};
        List<String> tmp = new ArrayList<>();
        tmp.add(words[0]);
        for(int i=1; i<words.length; i++) {
            if((i+1) % n == 1) {
                count ++;
            }
            if(words[i].charAt(0) != c || tmp.contains(words[i]) || words[i].length() == 1) {
                answer[0] = i%n + 1;
                answer[1] = count;
                break;
            }
            c = words[i].charAt(words[i].length()-1);
            tmp.add(words[i]);
        }
        return answer;
    }
}