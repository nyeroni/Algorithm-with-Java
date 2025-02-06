class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        int count = 0;
        if(is_suffix.length() > my_string.length()) return 0;
        for(int i=my_string.length()-is_suffix.length(); i<my_string.length(); i++) {
            if(is_suffix.charAt(i-(my_string.length()-is_suffix.length())) == my_string.charAt(i)) {
                count ++;
            }
        }
        if(count == is_suffix.length()) {
            answer = 1;
        }
        return answer;
    }
}