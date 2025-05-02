class Solution {
    public long solution(long n) {
        long answer = 0;
        long i = (long) Math.sqrt(n);
        System.out.println("i : " + i);
        if(i * i == n) {
            answer = (i+1) * (i+1);
        }
        else answer = -1;
        return answer;
    }
}