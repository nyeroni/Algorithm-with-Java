class Solution {
    public int[] solution(String s) {
        int sum = 0;
        int cnt = 0;
        while(true) {
            int one = removeZero(s);
            int zero = s.length() - one;
            if(s.equals("1")) break;
            s = Integer.toBinaryString(one);
            sum += zero;
            cnt ++;
        }
        return new int[]{cnt, sum};
    }
    public int removeZero(String s) {
        int cnt = 0;
        for(char c : s.toCharArray()) {
            if(c == '1') {
                cnt ++;
            }
        }
        return cnt;
    }
}