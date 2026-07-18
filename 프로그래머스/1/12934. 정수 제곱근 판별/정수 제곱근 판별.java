import java.util.*;

class Solution {
    public long solution(long n) {
        if(check(n)) {
            long num = (long)Math.sqrt(n) + 1;
            return num * num;
        }
        return -1;
    }
    public boolean check(long n) {
        long num = (long)Math.sqrt(n);
        if(num * num == n) return true;
        return false;
    }
}