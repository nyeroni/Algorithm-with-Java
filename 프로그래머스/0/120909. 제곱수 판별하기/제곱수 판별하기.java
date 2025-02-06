class Solution {
    public int solution(int n) {
        int i=1;
        int answer = 2;
        while(true) {
            if(i*i > n) break;
            if(i*i == n) {
                answer = 1;
                break;
            }
            i++;
        }
        return answer;
    }
}