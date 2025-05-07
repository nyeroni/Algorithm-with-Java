class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c == ' ') {
                answer += ' ';
                continue;
            }
            char cc = (char)(c + n);
            if(Character.isLowerCase(c)) {
                if(cc > 'z') {
                    cc = (char)(cc - 26);
                }
            } else if(Character.isUpperCase(c)) {
                if(cc > 'Z') {
                    cc = (char)(cc - 26);
                }
            }
            answer += cc;
        }
        return answer;
    }
}