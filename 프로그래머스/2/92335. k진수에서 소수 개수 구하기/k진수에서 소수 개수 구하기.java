import java.util.*;

class Solution {
    public int solution(int n, int k) {
        String str = Integer.toString(n, k);
        System.out.println("str : " + str);
        List<Long> list = new ArrayList<>();
        String s = "";
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == '0') {
                if(!s.equals("")) list.add(Long.parseLong(s));
                s = "";
            } else {
                s += str.charAt(i);
            }
        }
        if(!s.equals("")) list.add(Long.parseLong(s));
        int answer = 0;
        for(long num : list) {
            if(isPrime(num)) answer ++;
        }
        return answer;
        
    }
    private boolean isPrime(long num) {
        if(num == 1) return false;
        if(num == 2 || num == 3) return true;
        for(int i=2; i<=Math.sqrt(num); i++) {
            if(num%i == 0) {
                return false;
            }
        }
        return true;
        
    }
}