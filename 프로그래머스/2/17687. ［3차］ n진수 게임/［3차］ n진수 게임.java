class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder sb = new StringBuilder();
        int num = 0;
        int count = 0;
        int total = 0;
        while(count < t) {
            String str = Integer.toString(num, n);
            for(int i=0; i<str.length(); i++) {
                if(count == t) break;
                if(((total + i) % m) == (p-1)) {
                    sb.append(String.valueOf(str.charAt(i)).toUpperCase());
                    count ++;
                }
            }
            total += str.length();
            num ++;
        }
        return sb.toString();
    }
}