class Solution {
    public long solution(long n) {
        long answer = 0;
        long sqrtN = (long) Math.sqrt(n);
        if(sqrtN*sqrtN == n) {
            answer = (sqrtN + 1) * (sqrtN + 1);
        }
        else answer = -1;
        return answer;
    }
}