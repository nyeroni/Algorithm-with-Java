class Solution {
    public int solution(int n) {
        int answer = 1;
        for(int i=1; i<=n/2; i++) {
            int idx = i;
            int sum = 0;
            while(true) {
                sum += idx;
                idx ++;
                if(sum == n) {
                    answer ++;
                    break;
                } else if(sum > n) {
                    break;
                }
            }
        }
        return answer;
    }
}