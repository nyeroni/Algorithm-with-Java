class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        boolean[] flag = new boolean[n+1];
        for(int i=0; i<section.length; i++) {
            flag[section[i]] = true;
        }
        for(int i=0; i<section.length; i++) {
            if(flag[section[i]]) {
                int num = section[i] + m ;
                if(num > n) {
                    num = n + 1;
                }
                for(int j=section[i]; j<num; j++) {
                    flag[j] = false;
                }
                answer ++;
            }
        }
        return answer;
    }
}