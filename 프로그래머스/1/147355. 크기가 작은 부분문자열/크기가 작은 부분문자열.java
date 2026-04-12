class Solution {
    public int solution(String t, String p) {
        int len = p.length();
        int answer = 0;
        Long num = Long.parseLong(p);
        for(int i=0; i<=t.length()-len; i++) {
            Long s = Long.parseLong(t.substring(i, i+len));
            if(s <= num) answer ++;
        }
        return answer;
    }
}