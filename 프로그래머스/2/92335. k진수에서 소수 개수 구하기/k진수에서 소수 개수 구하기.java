import java.util.*;

class Solution {
    public int solution(int n, int k) {
        String str = Integer.toString(n, k);
        System.out.println("str :" + str);
        int answer = 0;
        String[] array = str.split("0");
        for(String s : array) {
            if(!s.equals("") && isPrime(Long.parseLong(s))) {
                answer ++;
            }
        }
        return answer;
    }
    public boolean isPrime(Long num) {
        if(num == 1) return false;
        if(num == 2 || num == 3) return true;
        for(int i=2; i<=Math.sqrt(num); i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}