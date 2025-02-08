class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        String[][] tmp;
        if(my_string.length() % m == 0) {
            tmp = new String[my_string.length()/m][m];
        } else {
            tmp = new String[my_string.length()/m + 1][m];
        }
        
        int j=0;
        int k=0;
        for(int i=0; i<my_string.length(); i++) {
            if((i+1)%m == 0) {
                tmp[j][k] = String.valueOf(my_string.charAt(i));

                j++;
                k=0;
            }
            else {
                tmp[j][k] = String.valueOf(my_string.charAt(i));
                k++;
            }
        }
        for(int i=0; i<tmp.length; i++) {
            answer += tmp[i][c-1];
        }
        return answer;
    }
}