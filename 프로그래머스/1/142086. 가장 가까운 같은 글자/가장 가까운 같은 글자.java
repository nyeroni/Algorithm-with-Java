class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
    
        for(int i=0; i<s.length(); i++) {
            int num = -1;
            for(int j=i-1; j>=0; j--) {
                if(s.charAt(i) == s.charAt(j)) {
                    num = i-j;
                    break;
                }
            }
            answer[i] = num;
        }
        return answer;
    }
}