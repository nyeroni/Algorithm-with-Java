class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(true) {
            if(n < a) {
                break;
            }
            answer += (n/a) * b;
            System.out.println("answer : " + answer);
            n = (n/a) * b + n%a;
            System.out.println("n : " + n);
        }
        return answer;
    }
}