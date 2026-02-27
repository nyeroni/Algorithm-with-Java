class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int minW = Math.min(wallet[0], wallet[1]);
        int maxW = Math.max(wallet[0], wallet[1]);
        
        while(true) {
            int minB = Math.min(bill[0], bill[1]);
            int maxB = Math.max(bill[0], bill[1]);

            if(minB <= minW && maxB <= maxW) {
                break;
            }
            bill[0] = maxB/2;
            bill[1] = minB;
            answer ++;
        }
        return answer;
    }
}