class Solution {
    public int solution(int[] number) {
        int answer = 0;
        for(int i=0; i<number.length-2; i++) {
            for(int j=i+1; j<number.length-1; j++) {
                for(int l=j+1; l<number.length; l++) {
                    if(number[i] + number[j] + number[l] == 0) {
                        answer ++;
                    }
                }
            }
        }
        return answer;
    }
}