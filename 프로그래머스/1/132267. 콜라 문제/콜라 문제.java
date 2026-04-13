class Solution {
    public int solution(int a, int b, int n) {
        int t = 0;
        int answer = 0;
        while(n>=a) {
            t = (n/a) * b;
            answer += t;
            t += n%a;
            n = t;
        }
        return answer;
    }
}