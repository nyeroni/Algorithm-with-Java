class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        int i=1;
        int num = 0;
        int cnt = 0;
        String str = "";
        while(cnt < t) {
            str = Integer.toString(num, n).toUpperCase();
            for(char c : str.toCharArray()) {
                if(i > m) { 
                    i=1;
                }
                if(i == p) {
                    answer += String.valueOf(c);
                    cnt ++;
                }
                i++;   
                if(cnt == t) {
                    break;
                }
            }
            num ++;
        }
        
        return answer;
    }
}