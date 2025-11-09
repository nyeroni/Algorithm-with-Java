class Solution {
    public int solution(int balls, int share) {
        
        long result = 1;
        if(balls - share < share) {
            share = balls - share;
        }
        for (int i = 0; i < share; i++) {
            result *= balls;
            balls --;
            result /= (i+1);
            // System.out.println("result : " + result);
        }

        return (int)result;
    }
}