class Solution {
    public int solution(int n) {
        int count = countOnes(binary(n));
        while(countOnes(binary(++n)) != count);
        return n;
        
    }
    public String binary(int n) {
        return Integer.toBinaryString(n);
    }
    public int countOnes(String str) {
        int cnt=0;
        for(int i = str.length()-1; i>=0; i--) {
            if(str.charAt(i)=='1') {
                cnt ++;
            }
        }
        return cnt;
    }
}