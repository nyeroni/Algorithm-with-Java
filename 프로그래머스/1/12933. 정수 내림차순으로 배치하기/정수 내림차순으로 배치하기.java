import java.util.*;

class Solution {
    public long solution(long n) {
        List<Integer> list = new ArrayList<>();
        while(n>0) {
            list.add((int)(n%10));
            n/=10;
        }
        Collections.sort(list, Collections.reverseOrder());
        String str = "";
        for(int num : list) {
            str += String.valueOf(num);
        }
        return Long.parseLong(str);
    }
}