class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()) {
            if(c == ' ') {
                sb.append(' ');
                continue;
            }
            if(c >= 'a' && c <='z') {
                sb.append((char)('a' + (c + n - 'a')%26));
            } 
            else if(c >= 'A' && c <= 'Z') {
                sb.append((char)('A' + (c + n - 'A')%26));
            }
        }
        return sb.toString();
    }
}