class Solution {
    public long solution(int price, int money, int count) {
        long sum = 0;
        for(int i=0; i<count; i++) {
            sum += price * (i+1);
        }
        if(sum <= money) {
            return 0;
        } 
        return sum-money;
    }
}