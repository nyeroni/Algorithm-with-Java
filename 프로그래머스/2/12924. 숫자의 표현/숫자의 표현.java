class Solution {
    public int solution(int n) {
        int answer = 0;
 
        for(int i=1; i<=n/2; i++) {
            int sum = 0;
            int tmp = i;
            while(true) {
                sum += tmp;
                tmp ++;
                if(sum > n) {
                    break;
                } else if(sum == n) {
                    answer ++;
                    break;
                }
            }
        }
        return answer+1;
    }
}