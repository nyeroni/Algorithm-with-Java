class Solution {
    public int solution(String s) {
        int answer = 0;
        char c = s.charAt(0);
        int i = 1;
        int a = 1, b = 0;
        while(true) {
            if(i == s.length()) {
                break;
            }
            if(a == b) {
                answer ++;
                a = 0;
                b = 0;
                c = s.charAt(i);
            }
            if(c == s.charAt(i)) {
                a++;
            } else {
                b++;
            }
            i++;
        }
        answer ++;
        return answer;
    }
}