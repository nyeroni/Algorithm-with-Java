class Solution {
    boolean solution(String s) {
        int a = 0, b = 0;
        for(char c : s.toCharArray()) {
            if(c == 'p' || c == 'P') {
                a++;
            } else if(c == 'y' || c == 'Y') {
                b++;
            }
        }
        if(a == b) return true;
        return false;
    }
}