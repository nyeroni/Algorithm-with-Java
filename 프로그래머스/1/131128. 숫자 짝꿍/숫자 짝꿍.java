import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        int []xCount = new int[10];
        int []yCount = new int[10];
        
        for(int i=0; i<X.length(); i++) {
            int idx = Integer.parseInt(String.valueOf(X.charAt(i)));
            xCount[idx] ++;
        }
        for(int i=0; i<Y.length(); i++) {
            int idx = Integer.parseInt(String.valueOf(Y.charAt(i)));
            yCount[idx] ++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=9; i>=0; i--) {
            while(xCount[i] > 0 && yCount[i] > 0) {
                    xCount[i] --;
                    yCount[i] --;
                    sb.append(i);
            }
        }
        if("".equals(sb.toString())) return "-1";
        if(sb.charAt(0) == '0') return "0";
        return sb.toString();
    }
}