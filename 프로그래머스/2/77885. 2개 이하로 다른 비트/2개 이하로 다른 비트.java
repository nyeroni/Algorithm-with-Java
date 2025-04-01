import java.util.*;
class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        int idx = 0;
        for(long num : numbers) {
            String n = Long.toString(num, 2);
            String next = Long.toString(num+1, 2);
            //100 101
            
            if(n.length() == next.length()) {
                if(n.charAt(n.length()-1) == '0') {
                    answer[idx] = num + 1;
                }
                else {
                    int pos = n.lastIndexOf("01");
                    String binary = n.substring(0, pos);
                    binary += "10";
                    if(binary.length() < n.length()) {
                        binary += n.substring(pos+2, n.length());
                    }
                    answer[idx] = Long.parseLong(binary, 2);
                }
            } else {
                //111 1000
                long pow = (long)Math.pow(2, n.length()-1);
                answer[idx] = num + pow;
            }
            idx ++;
        }
        
        return answer;
    }
}