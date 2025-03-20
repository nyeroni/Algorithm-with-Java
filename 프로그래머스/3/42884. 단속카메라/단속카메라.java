import java.util.*;
class Solution {
    public int solution(int[][] routes) {
        Arrays.sort(routes, (a, b) -> Integer.compare(a[1], b[1]));
        /*
        -20 -15
        -18 -13
        -14 5
        -5 -3
        */
        
        int cnt = 1;
        int pos = routes[0][1];
        for(int i=0; i<routes.length; i++) {
            if(pos < routes[i][0]) {
                cnt ++;
                pos = routes[i][1];
            }
        }
        return cnt;
    }
}