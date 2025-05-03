class Solution {
    public boolean solution(String s) {
        int tmp = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                tmp ++;
            }
        }
        if(tmp == s.length() && (s.length() == 4 || s.length() == 6)) return true;
        return false;
    }
}