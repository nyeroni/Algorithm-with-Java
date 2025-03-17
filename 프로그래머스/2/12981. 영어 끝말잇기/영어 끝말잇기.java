import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        answer[0] = 0;
        answer[1] = 0;
        List<String> tmp = new ArrayList<>();
        for(int i=0; i<words.length; i++) {
            String str = words[i];
            if(tmp.size()!= 0 && (tmp.get(tmp.size()-1).charAt(tmp.get(tmp.size()-1).length()-1) != str.charAt(0) || tmp.contains(str) || str.length() < 2) ) {
                System.out.println("I : " + i);
                answer[0] = (i)%n + 1;
                answer[1] = i/n + 1;
                //n=3 012 -> 1 345 -> 2 678 -> 3
                //n=2 01 -> 1 23 -> 2 45 -> 3 67 -> 4
                break;

            } else {
                tmp.add(str);
            }
        }

        return answer;
    }
}