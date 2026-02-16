class Solution {
    public int[] solution(String s) {
        int cnt = 0;
        int remove = 0;
       
        while(true) {
            int num = removeZero(s);
            remove += s.length() - num;
            s = Integer.toBinaryString(num);
            cnt ++;
            if(s.equals("1")) break;
        }
        return new int[]{cnt, remove};
    }
    private int removeZero(String s) {
        int cnt = 0;
        for(char c : s.toCharArray()) {
            if(c == '1') {
                cnt ++;
            }
        }
        return cnt;
    }
}