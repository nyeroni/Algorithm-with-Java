import java.util.*;

class Solution {
    public long solution(long n) {
        long l = (long)Math.sqrt(n);
        if(l * l == n) return (l+1) * (l+1);
        return -1;
    }
}