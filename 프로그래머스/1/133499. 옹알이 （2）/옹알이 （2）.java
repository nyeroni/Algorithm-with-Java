class Solution {
    public int solution(String[] babbling) {
        String[] impossible = {"ayaaya", "yeye", "woowoo", "mama"};
        String[] possible = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        for(String s : babbling) {
            for(String i : impossible) {
                s = s.replace(i, "X");
            }
            for(String p : possible) {
                s = s.replace(p, "O");
            }
            boolean flag = false;
            for(char c : s.toCharArray()) {
                if(c != 'O') flag = true;
            }
            if(!flag) answer ++;
        }
        return answer;
    }
}