class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        for(int i=myString.length()-1; i>=pat.length()-1; i--) {
            int cnt=0;
            for(int j=0; j<pat.length(); j++) {
                if(myString.charAt(i-j) == pat.charAt(pat.length()-1-j)) {
                    cnt++;
                }
            }
            if(cnt == pat.length()) {
                answer = myString.substring(0, i+1);
                break;
            }
        }
        return answer;
    }
}