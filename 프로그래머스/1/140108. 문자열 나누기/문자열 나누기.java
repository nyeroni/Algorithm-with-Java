class Solution {
    public int solution(String s) {
        int countX = 1, countY = 0;;
        int i = 1;
        if(s.length() == 1) return 1;
        char x = s.charAt(0);
        int answer = 0;
        while(i < s.length()) {

            if(countX == countY) {
                answer ++;
                x = s.charAt(i);
                countX = 0;
                countY = 0;
            }
            if(s.charAt(i) == x) {
                countX ++;
            }
            else {
                countY ++;
            }
          
            i++;
            if(i == s.length()) {
                answer ++;
                break;
            }
            
        }
        return answer;
    }
}