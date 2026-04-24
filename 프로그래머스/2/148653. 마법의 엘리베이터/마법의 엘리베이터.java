class Solution {
    public int solution(int storey) {
        // 5보다 작으면 -
        // 5보다 같거나 크면 +
        int answer = 0;
        while(storey > 0) {
            if(storey%10 < 5) {
                answer += storey%10;
                storey -= storey%10;
            } else if(storey%10 > 5) {
                answer += (10 - storey%10);
                storey += storey%10;
            } else {
                answer += storey%10;
                if(storey/10%10 < 5) {
                    storey -= storey%10;
                } else {
                    storey += storey%10;
                }
            }
            storey/=10;
        }
        return answer;
    }
}