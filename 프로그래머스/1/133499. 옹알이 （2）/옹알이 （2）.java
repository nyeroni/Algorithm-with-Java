class Solution {
    public int solution(String[] babbling) {
        String[] possible = {"aya", "ye", "woo", "ma"};
        String[] impossible = {"ayaaya", "yeye", "woowoo", "mama"};
        
        boolean flag = false;
        int answer = 0;
        for(String b : babbling) {
            flag = false;
            for(String i : impossible) {
                b = b.replace(i, "X");
            }
            if(flag) continue;
            for(String p : possible) {
                b = b.replace(p, "O");
            }
            for(char c : b.toCharArray()) {
                if(c != 'O') {
                    flag = true;
                }
            }
            if(!flag) {
                answer++;
            }
        }
        return answer;
    }
}