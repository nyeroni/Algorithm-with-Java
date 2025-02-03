class Solution {
    public String solution(String rny_string) {
        String answer = "";
        for(int i=0; i<rny_string.length(); i++) {
            char a = rny_string.charAt(i);
            
            if(a == 'm') {
                answer += "rn";
            } else {
                answer += a;
            }
        }
        return answer;
    }
}