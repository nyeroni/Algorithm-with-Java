class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();
        int cnt = 0;
        for(char c : s.toCharArray()) {
            if(c == 'p') {
                cnt ++;
            } else if(c == 'y') cnt --;
        }
        if(cnt == 0) return true;
        return false;
    }
}