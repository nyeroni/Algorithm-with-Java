class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        for(int i=0; i<t.length() - p.length()+1; i++) {
            String s = t.substring(i, i + p.length());
            long a = Long.parseLong(s);
            long b = Long.parseLong(p);
            if(a <= b) answer ++;
        }
        return answer;
    }
}