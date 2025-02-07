import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int []tmp = {a, b, c, d};
        Arrays.sort(tmp);
        if(tmp[0] == tmp[3]) {
            answer = 1111 * a;
        } else if(tmp[0] == tmp[2] || tmp[1] == tmp[3]) {
            if(tmp[0] == tmp[2]) {
                answer = (10 * tmp[0] + tmp[3]) * (10 * tmp[0] + tmp[3]);
            } else if(tmp[1] == tmp[3]) {
                answer = (10 * tmp[1] + tmp[0]) * (10 * tmp[1] + tmp[0]);
            }
        } else if(tmp[0] == tmp[1] && tmp[2] == tmp[3]) {
            answer = (tmp[0] + tmp[2]) * Math.abs(tmp[0] - tmp[2]);
        } else if (tmp[0] == tmp[1]) {
            answer = tmp[2] * tmp[3];
        } else if (tmp[1] == tmp[2]) {
            answer = tmp[0] * tmp[3];
        } else if (tmp[2] == tmp[3]) {
            answer = tmp[0] * tmp[1];
        } else {
            answer = tmp[0];
        }
        
        return answer;
    }
}