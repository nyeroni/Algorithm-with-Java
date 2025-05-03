class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = GCD(n, m);
        answer[1] = LCM(n, m);
        return answer;
    }
    public int GCD(int n, int m) {
        while(m != 0) {
            int r = n % m;
            n = m;
            m = r;
        }
        return n;
    }
    public int LCM(int n, int m) {
        return n * m / GCD(n, m);
    }
}