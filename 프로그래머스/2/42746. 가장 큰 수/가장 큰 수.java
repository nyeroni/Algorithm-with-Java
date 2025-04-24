import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        
        String[] str = new String[numbers.length];
        int j=0;
        for(int i : numbers) {
            str[j++] = String.valueOf(i);
        }
        
        Arrays.sort(str, (a, b) -> 
            (b + a).compareTo(a + b)
        );
        for(String s : str) {
            sb.append(s);
        }
        if(sb.toString().charAt(0) == '0') return "0";
        return sb.toString();
    }
}