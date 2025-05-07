class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        boolean flag = false;
        for(int i=0; i<s.length(); i++) {
            flag = false;
            for(int j=i-1; j>=0; j--){
                if(s.charAt(i) == s.charAt(j)) {
                    answer[i] = i-j;
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                answer[i] = -1;
            }
        }
        return answer;
    }
}