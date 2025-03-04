import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        List<Long> tmp = new ArrayList<>();
        while(n>0) {
            tmp.add(n%10);
            n/=10;
        }
        Collections.sort(tmp);
        String str = "";
        while(tmp.size()>0) {
            str+= tmp.remove(tmp.size()-1);
        }
        answer = Long.parseLong(str);
        return answer;
    }
}