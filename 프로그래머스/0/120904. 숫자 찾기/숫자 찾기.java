class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String str = String.valueOf(num);
        String[] tmp = str.split("");
        String t = String.valueOf(k);
        for(int i=0; i<tmp.length; i++) {
            if(tmp[i].charAt(0) == t.charAt(0)) {
                answer = i + 1;
                break;
            }
        }
        if(answer == 0) return -1;
        return answer;
    }
}