class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int l = LCM(n, m);
        int g = GCD(n, m);
        answer[0] = g;
        answer[1] = l;
        return answer;
    }
    public int GCD(int n, int m) {
        while(m!=0) {
            int r = n%m;
            n = m;
            m = r;
        }
        return n;
    }
    public int LCM(int n, int m) {
        return n * m/GCD(n,m);
    }
}