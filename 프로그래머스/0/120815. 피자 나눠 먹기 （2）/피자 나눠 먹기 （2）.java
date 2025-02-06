class Solution {
    public int solution(int n) {
        int answer = 0;
        int p = 6;
        int count = 1;
        while(true) {
            if((count * p) % n == 0) {
                answer = count ;
                break;
            }
            count ++;
        }
        return answer;
    }
}