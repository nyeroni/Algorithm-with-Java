class Solution {
    public long solution(int[] sequence) {
        long answer = 0;
        
        long sum1 = 0;
        long sum2 = 0;
        boolean flag = true;
        for(int i=0; i<sequence.length; i++) {
            int sign = 1;
            if(flag) {
                sign = 1;
            } else sign = -1;
            
            long num1 = sign * sequence[i];
            long num2 = -sign * sequence[i];
            
            sum1 = Math.max(num1, sum1 + num1);
            sum2 = Math.max(num2, sum2 + num2);
            
            answer = Math.max(answer, Math.max(sum1, sum2));
            flag = !flag;
        }
        return answer;
    }
}