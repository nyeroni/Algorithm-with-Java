class Solution {
    public int solution(int n) {
        String s = Integer.toString(n, 2);
        int cnt = countOne(s);
        while(true) {
            if(cnt == countOne(Integer.toString(++n, 2))) break;
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