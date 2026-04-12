class Solution {
    public int solution(int n) {
        if(n == 0) return 0;
        else if(n == 1) return 1;
        int answer = n + 1;
        int s = (int) Math.sqrt(n);
        for(int i=2; i<=s; i++) {
            if(i * i == n && n % i == 0) answer += i;
            else if(n % i == 0)  {
                answer += i;
                answer += n/i;
            }
        }
        
        return answer;
    }
}