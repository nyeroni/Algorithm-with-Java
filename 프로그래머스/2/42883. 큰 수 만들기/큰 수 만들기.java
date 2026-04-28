import java.util.*;
class Solution {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        int idx = number.length();
        for(int i=0; i<number.length(); i++) {
            // System.out.println("==number.charAt(i) : " + number.charAt(i)  + ", toString : " + sb.toString());
            while(k > 0 && sb.length() > 0) {
                if(Integer.parseInt("" + sb.charAt(sb.length()-1)) < Integer.parseInt("" + number.charAt(i))) {
                    // System.out.println("delete : " + sb.charAt(sb.length()-1));
                    sb.deleteCharAt(sb.length()-1);
                    k--;
                } else break;
            }                 
            sb.append(number.charAt(i));
        }
        
        return sb.substring(0, sb.length()-k);
    }
}