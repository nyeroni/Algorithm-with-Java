class Solution {
    public String solution(String s) {
        int len = s.length();
        if(len % 2 == 0) {
            return String.valueOf("" + s.charAt(len/2-1) + s.charAt(len/2)) ;
        }
        return String.valueOf(s.charAt(len/2));
    }
}