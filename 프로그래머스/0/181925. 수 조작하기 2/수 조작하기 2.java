class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        for(int i=1; i<numLog.length; i++) {
            int n=numLog[i-1];
            if(numLog[i] - n == 1) {
                answer += "w";
            } else if(numLog[i] - n == -1) {
                answer += "s";
            } else if(numLog[i] - n == 10) {
                answer += "d";
            } else if(numLog[i] - n == -10) {
                answer += "a";
            }
        }
        return answer;
    }
}