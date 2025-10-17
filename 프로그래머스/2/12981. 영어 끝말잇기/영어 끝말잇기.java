import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int []answer = new int[2];
        List<String> list = new LinkedList<>();
        int count = 1;
        list.add(words[0]);
        for(int i=1; i<words.length; i++) {
            if(i%n == 0) count ++;
            if(words[i-1].charAt((words[i-1].length()-1)) != words[i].charAt(0) || list.contains(words[i])) {
                answer[0] = i%n + 1;
                answer[1] = count;
                return answer;
            }
            list.add(words[i]);
        }
    
        return answer;
    }
}