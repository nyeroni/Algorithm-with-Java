class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left; i<= right; i++) {
            int d = divisor(i);
            System.out.println("i : " + i + ", d : " + d);
            if(d % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
            System.out.println("answer: " + answer);
        }
        return answer;
    }
    public int divisor(int n) {
        int count = 1;
        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n%i == 0) {
                count ++;
            }
        }
        
        if((int)Math.sqrt(n) * (int)Math.sqrt(n) == n) {
            return count * 2-1;
        }
        return count * 2;
    }
}