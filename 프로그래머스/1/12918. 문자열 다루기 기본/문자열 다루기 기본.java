class Solution {
    public boolean solution(String s) {
        int len = s.length();
        if(len != 4 && len != 6) return false;
        int cnt = 0;
        for(char c : s.toCharArray()) {
            if(c >= '0' && c <= '9') {
                cnt ++;
            }
        }
        if(cnt == len) return true;
        return false;
    }
}