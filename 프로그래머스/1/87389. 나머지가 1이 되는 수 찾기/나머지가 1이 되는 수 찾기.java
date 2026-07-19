class Solution {
    public int solution(int n) {
        int x = 1;
        while(n > x) {
            if(n % x == 1) {
                break;
            }
            x++;
        }
        return x;
    }
}