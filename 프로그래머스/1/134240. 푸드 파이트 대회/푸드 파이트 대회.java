class Solution {
    public String solution(int[] food) {
        String answer = "";
        for(int i=1; i<food.length; i++) {
            for(int j=0; j<food[i]/2; j++) {
                answer += i;
            }
        }
        String tmp = answer;
        answer += "0";
        StringBuffer sb = new StringBuffer(tmp);
        tmp = sb.reverse().toString();
        answer += tmp;
        return answer;
    }
}