class Solution {
    public int solution(int n) {
        int cnt = countBinary(n);
        int tmp = 0;
        while(true) {
            tmp = countBinary(++n);
            if(cnt == tmp) break;
        }
        return n;   
    }
    public int countBinary(int n) {
        String s = Integer.toString(n, 2);
        // System.out.println("n : " + n + ", s : " + s);
        int count = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '1') {
                count ++;
            }
        }
        return count;
    }
}