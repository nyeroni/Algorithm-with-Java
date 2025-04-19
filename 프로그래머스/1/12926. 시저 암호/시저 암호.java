class Solution {
    public String solution(String s, int n) {
        String answer = "";
        String [] str = s.split(" ");
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c == ' ') {
                answer += ' ';
                continue;
            }
            else if(Character.isLowerCase(c)) {
                c = (char)(c + n);
                if(c > 'z') {
                        c = (char)(c - 26);
                } 
            }
            else if(Character.isUpperCase(c)) {
                c = (char)(c + n);
                System.out.println("C : " + c);
                if(c > 'Z') {
                        c = (char)(c - 26);
                } 
            }
            answer += String.valueOf(c);
        }
        return answer;
    }
}