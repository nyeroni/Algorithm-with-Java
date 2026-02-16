class Solution {
    public int solution(int n) {
        String s = Integer.toBinaryString(n);
        int num = countOne(s);
        while(true) {
           n++;
            s = Integer.toBinaryString(n);
            if(num == countOne(s)) {
                break;
            }
        }
        return n;
    }
    private int countOne(String s) {
        int cnt = 0;
        for(char c : s.toCharArray()) {
            if(c == '1') {
                cnt ++;
            }
        }
        return cnt;
    }
}