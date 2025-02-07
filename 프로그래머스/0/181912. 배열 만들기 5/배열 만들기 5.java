import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer;
        List<Integer> num = new ArrayList<>();
        for(int i=0; i<intStrs.length; i++) {
            String tmp = intStrs[i].substring(s, s+l);
            if(Integer.parseInt(tmp) > k){
                num.add(Integer.parseInt(tmp));
            }
        }
        answer = num.stream().mapToInt(i->i).toArray();
        return answer;
    }
}