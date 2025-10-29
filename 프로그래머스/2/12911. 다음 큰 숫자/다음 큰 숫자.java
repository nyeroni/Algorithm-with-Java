class Solution {
    public int solution(int n) {
        int cnt = cntOne(n);
        while(true) {
            if(cntOne(++n) == cnt) {
                break;
            }
        }
        return n;
    }
    public int cntOne(int n) {
        String str = Integer.toBinaryString(n);
        int cnt = 0;
        for(char c : str.toCharArray()) {
            if(c == '1') {
                cnt ++;
            }
        }
        return cnt;
    }
}