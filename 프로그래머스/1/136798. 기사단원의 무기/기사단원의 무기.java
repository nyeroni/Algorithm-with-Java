class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i=1; i<=number; i++) {
            int c = count(i);
            if(c <= limit) {
                answer += c;
            } else {
                answer += power;
            }
        }
        return answer;
    }
    public int count (int n ) {
        int cnt = 0;
        for(int i=1; i<=Math.sqrt(n); i++) {
            if(n%i == 0) {
                cnt ++;
            }
        }
        if((int)Math.sqrt(n) * (int) Math.sqrt(n) == n) {
            return cnt * 2 - 1;
        } 
        return cnt * 2;
    }
}