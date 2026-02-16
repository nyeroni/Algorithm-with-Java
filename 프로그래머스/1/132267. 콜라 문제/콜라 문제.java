class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(true) {
            System.out.println("n :" + n);
            if(n < a) break;
            int num = n/a;
            int total = n - num * a;
            total += b * num;
            answer += b * num;
            n = total;
        }
        return answer;
    }
}