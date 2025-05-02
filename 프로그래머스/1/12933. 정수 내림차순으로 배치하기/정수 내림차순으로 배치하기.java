import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        List<Integer> tmp = new ArrayList<>();
        while(n>0) {
            tmp.add((int)(n%10));
            n/=10;
        }
        tmp.sort(Comparator.reverseOrder());
        String str = "";
        for(int i=0; i<tmp.size(); i++) {
            str += String.valueOf(tmp.get(i));
        }
        answer = Long.parseLong(str);
        return answer;
    }
}