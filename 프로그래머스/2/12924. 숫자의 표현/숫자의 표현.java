class Solution {
    public int solution(int n) {
        int start = 0;
        int sum = 0;
        int answer = 0;
        for(int i=1; i<=n; i++) {
            sum += i;
            while(sum > n) {
                sum -= start;
                start ++;
            }
            if(sum == n) {
                answer ++;
            }
        }
        return answer;
    }
}