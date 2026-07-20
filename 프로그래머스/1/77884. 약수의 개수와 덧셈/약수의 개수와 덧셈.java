class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left; i<=right; i++) {
            if(count(i) % 2 == 0) {
                answer += i;
            } else answer -= i;
        }
        return answer;
    }
    public int count(int num) {
        if(num == 1) return 1;
        else if(num ==2 || num == 3) return 2;
        int cnt = 2;
        for(int i=2; i<=Math.sqrt(num); i++) {
            if(i * i == num) {
                cnt --;
            } 
            if(num % i == 0) {
                cnt += 2;
            }
        }
        return cnt;
    }
}