class Solution {
    public int solution(int n) {
        int i=2;
        int remove = 1;
        int sum = 1;
        int answer = 0;
        while(sum > 0) {
            if(sum + i <= n) {
                sum += i;
                i++;
                if(sum == n) {
                    answer ++;
                }
            } else if(sum + i > n) {
                sum -= remove;
                remove ++;
            }
        }
        return answer + 1;
    }
}