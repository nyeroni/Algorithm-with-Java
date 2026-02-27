import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        
        Arrays.sort(score);
       // 1 1 1 2 2 3 3 
        int answer = 0;
        for(int i=score.length-m; i>=0; i-= m) {
            answer += score[i] * m;
        }
        return answer;
    }
}