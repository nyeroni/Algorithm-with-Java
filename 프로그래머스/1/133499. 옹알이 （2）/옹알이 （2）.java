class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String [] possible = {"aya", "ye", "woo", "ma"};
        String [] impossible = {"ayaaya", "yeye", "woowoo", "mama"};
        for(String str : babbling) {
            for(String i : impossible) {
                str = str.replace(i, "X");
            } 
            for(String p : possible) {
                str = str.replace(p, "O");
            }
            boolean flag = false;
            for(int i=0; i<str.length(); i++) {
                if(str.charAt(i) != 'O') {
                    flag = true;
                    break;
                }
            }
            if(!flag) answer ++;
        }
        return answer;
    }
}