import java.util.*;
class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer;
        List<Integer> tmp = new ArrayList<>();
        for(int i=0; i<numlist.length; i++) {
            if(numlist[i]%n==0) {
                tmp.add(numlist[i]);
            }
        }
        answer = tmp.stream().mapToInt(i->i).toArray();
        return answer;
    }
}