class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int n = x;
        int sum = 0;
        while(x>0) {
            sum += x%10;
            x/=10;
        }
        if(n % sum == 0) {
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }
}