class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int denom = denom1 * denom2;
        int numer = denom1 * numer2 + numer1 * denom2;
        int gcd = gcd(numer, denom);
        answer[0] = numer/gcd;
        answer[1] = denom/gcd;
        
        return answer;
    }
    public int gcd (int a, int b) {
        while(b!=0) {
            int r = a%b;
            a = b;
            b = r;
        }
        return a;
    }
}