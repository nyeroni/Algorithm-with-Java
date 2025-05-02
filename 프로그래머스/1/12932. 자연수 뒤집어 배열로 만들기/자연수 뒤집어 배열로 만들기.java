import java.util.*;

class Solution {
    public int[] solution(long n) {
        List<Integer> tmp = new ArrayList<>();
        
        while(n > 0) {
            tmp.add((int)(n%10));
            n/=10;
        }
        return tmp.stream().mapToInt(i->i).toArray();
    }
}