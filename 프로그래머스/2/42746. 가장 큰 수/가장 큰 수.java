import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        
        
        String[] str = Arrays.stream(numbers)
            .mapToObj(String::valueOf)
            .toArray(String[]::new);
        
        Arrays.sort(str, (a, b) -> (b+a).compareTo(a+b));
        for(String num : str) {
            sb.append(num);
        }
        if(sb.toString().charAt(0) == '0') return "0";
        else return sb.toString();
        
    }
}