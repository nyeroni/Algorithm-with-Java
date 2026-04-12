class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        int k=0;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == ' ') {
                k = 0;
                sb.append(" ");
                continue;
            } else if(k % 2 == 0) {
                sb.append(String.valueOf(s.charAt(i)).toUpperCase());
            } else if (k % 2 == 1) {
                sb.append(String.valueOf(s.charAt(i)).toLowerCase());
            }
            k++;
        }
        return sb.toString();
    }
}