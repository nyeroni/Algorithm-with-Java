class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String formation = Integer.toString(n, k);
        String[] tmp = formation.split("0+");
        for(String t : tmp) {
            double num = Double.parseDouble(t);
            if(isPrime(num)) {
                answer ++;
            }
        }
        return answer;
    }
    public boolean isPrime(double n) {
        if(n==1) return false;
        if(n==2) return true;
        for(double i=2; i<=Math.sqrt(n); i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }
}