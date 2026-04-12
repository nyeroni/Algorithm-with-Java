class Solution {
    public int[] solution(int n, int m) {
        return new int[]{GCD(n, m), LCM(n, m)};
    }
    public int GCD(int n, int m) {
        if(m==0) return n;
        return GCD(m, n%m);
    }
    public int LCM(int n, int m) {
        return n * m / GCD(n, m);
    }
}