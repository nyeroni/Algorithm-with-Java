import java.util.*;
class Solution {
    public int solution(int[][] routes) {
       Arrays.sort(routes, (a, b) -> Integer.compare(a[1], b[1]));
        
        int answer = 1;
        int pos = routes[0][1];
        
        for(int[] route : routes){ 
            if(pos < route[0]) {
                pos = route[1];
                answer++;
            }
        }
        return answer;
    }
}