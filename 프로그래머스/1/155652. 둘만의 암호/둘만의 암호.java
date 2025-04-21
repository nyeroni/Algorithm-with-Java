class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        for(int i=0; i<s.length(); i++) {
            int k=1;
            int count = 0;
            char c = (char)(s.charAt(i));
            while(true) {
                if(count==index) {
                    break;
                }
                c = (char)(c + 1);
    
                if(c > 'z') {
                    c = 'a';
                }   
                if(!skip.contains(String.valueOf(c))) {
                    count++;
                }
            }
            answer += c;
        }
        return answer;
    }
}