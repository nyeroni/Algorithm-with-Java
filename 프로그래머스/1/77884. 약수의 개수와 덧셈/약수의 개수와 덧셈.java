class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left; i<=right; i++) {
            int num = check(i);
            if(num % 2 == 0) answer += i;
            else answer -= i;
        }
        return answer;
    }
    private int check(int num) {
        if(num == 1) return 1;
        else if(num == 2 || num == 3) return 2;
        int cnt = 0;
        for(int i=2; i<=(int)Math.sqrt(num); i++) {
            if(i * i == num) cnt += 1;
            else if(num % i == 2) {
                cnt += 2;
            }
        }
        return cnt;
    }
}