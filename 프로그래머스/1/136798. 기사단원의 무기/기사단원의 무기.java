class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i=1; i<=number; i++) {
            int n = count(i);
            // System.out.println("n : " + n);
            if(n <= limit) {
                answer += n;
            } else answer += power;
        }
        return answer;
    }
    private int count(int num) {
        int answer = 0;
        int mid = (int)Math.sqrt(num);
        for(int i=1; i<=mid; i++) {
            // System.out.println("i : " + i);
            if(num % i == 0) answer += 2;
        }
        if(mid * mid == num) answer --;
        return answer;
    }
}