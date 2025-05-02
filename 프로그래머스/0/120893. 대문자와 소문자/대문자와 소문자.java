class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++) {
            if(my_string.charAt(i) >= 'a' && my_string.charAt(i) <= 'z') {
                answer += String.valueOf(my_string.charAt(i)).toUpperCase();
            }
            else if(my_string.charAt(i) >= 'A' && my_string.charAt(i) <= 'Z') {
                answer += String.valueOf(my_string.charAt(i)).toLowerCase();
            }
        }
        return answer;
    }
}