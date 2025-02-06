class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        int count = 0;
        if(is_prefix.length() > my_string.length()) return 0;
        for(int i=0; i<is_prefix.length(); i++) {
            if(my_string.charAt(i) == is_prefix.charAt(i)) {
                count ++;
            }
        }
        if(count == is_prefix.length()) answer = 1;
        else answer = 0;
        return answer;
    }
}