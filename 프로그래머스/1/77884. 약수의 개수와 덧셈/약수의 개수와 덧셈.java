class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left; i<=right; i++) {
            int num = cnt(i);
            System.out.println("num : " + num);
            if(num % 2 == 0) {
                answer += i;
            } else answer -= i;
        }
        return answer;
    }
    private int cnt(int n) {
        int count = 0;
        int mid = (int)Math.sqrt(n);
        
        for(int i=1; i<mid; i++) {
            if(n%i == 0) {
                count +=2;
            }
        }
        if(mid * mid == n) {
            count += 1; 
        }
        else count += 2; 
        return count;
    }
}