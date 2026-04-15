class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i=1; i<=number; i++) {
            int n = count(i);
            if(n <= limit) answer += n;
            else answer += power;
        }
        return answer;
    }
    private int count(int n) {
        int cnt = 0;
        for(int i=1; i<=Math.sqrt(n); i++) {
            if(n % i == 0) {
                cnt += 2;
            }
            if(i * i == n) cnt -= 1;

        }        
        return cnt;
    }
}