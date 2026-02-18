class Solution {
    public int solution(int[] arr) {
        int tmp = arr[0];
        for(int i=1; i<arr.length; i++) {
            tmp = lcm(tmp, arr[i]);
        }
        return tmp;
    }
    private int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a%b);
    }
    private int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}