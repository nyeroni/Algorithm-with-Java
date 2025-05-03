class Solution {
    public int solution(int n) {
        int answer = 0;
        String s = Integer.toString(n, 3);
        StringBuilder sb = new StringBuilder(s);
        s = sb.reverse().toString();
        answer = Integer.parseInt(s, 3);
        return answer;
    }
}