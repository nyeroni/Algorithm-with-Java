class Solution {
    public String solution(String s) {
        String answer = "";
        int idx = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == ' ') {
                answer += " ";
                idx = 0;
                continue;
            }
            String c = String.valueOf(s.charAt(i));
            if(idx % 2 == 0) {
                answer += c.toUpperCase();
            }
            else answer += c.toLowerCase();
            idx ++;
        }

        return answer;
    }
}