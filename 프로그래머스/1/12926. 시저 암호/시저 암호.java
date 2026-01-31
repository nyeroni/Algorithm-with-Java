class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(char c : s.toCharArray()) {
            if(c >= 'A' && c <= 'Z') {
                c = (char)('A' + (c + n - 'A')%26);
            } else if(c >= 'a' && c <= 'z') {
                c = (char)('a' + (c + n - 'a')%26);
                
            } else if(c == ' ') {
                c = ' ';
            }
            answer += c;
        }
        return answer;
    }
}