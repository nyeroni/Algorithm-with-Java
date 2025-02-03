class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String A = String.valueOf(a) + String.valueOf(b);
        String B = String.valueOf(b) + String.valueOf(a);

        int num1 = Integer.parseInt(A);
        int num2 = Integer.parseInt(B);
        if(num1 > num2) {
            answer = num1;
        } else answer = num2;
        return answer;
    }
}