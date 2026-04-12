class Solution {
    public boolean solution(String s) {
        int len = s.length();
        int cnt = 0;
        if(len != 4 && len != 6) return false;
        for(int i=0; i<len; i++) {
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9') cnt++;
            
        }
        
        return cnt == len ? true : false;
    }
}