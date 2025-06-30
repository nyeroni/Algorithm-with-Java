class Solution {
    public int solution(int order) {
        int answer = 0;
        String tmp = String.valueOf(order);
        String[] tmp2 = tmp.split("");
        for(String s : tmp2) {
            if(s.equals("3") || s.equals("6") || s.equals("9")) {
                answer ++;
            }
        }
        return answer;
    }
}