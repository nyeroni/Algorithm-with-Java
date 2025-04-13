class Solution {
    public int solution(int n) {
        return count(n);
    }
    private int count(int n) {
        if(n == 1) {
            return 1;
        }
        if(n == 2 || n == 3) {
            return 2;
        }
        int cnt = 1;
        for(int i=2; i<=n; i++) {
            if(n%i == 0) {
                cnt ++;
            }
        }
 
        return cnt;
    }
}