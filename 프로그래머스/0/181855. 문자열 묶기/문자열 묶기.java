import java.util.Arrays;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int []tmp = new int[30];
        for(int i=0; i<strArr.length; i++) {
            tmp[strArr[i].length()-1] ++;
        }
        answer = Arrays.stream(tmp).max().getAsInt();
        return answer;
    }
}