import java.util.*;

class Solution {
    public int solution(int[][] triangle) {
        int[][] tmp = new int[triangle.length][triangle.length];
        
        for(int i=0; i<triangle.length; i++) {
            for(int j=0; j<=i; j++) {
                tmp[i][j] = triangle[i][j];
            }
        }
        for(int i=1; i<triangle.length; i++) {
            tmp[i][0] = tmp[i-1][0] + triangle[i][0];
            tmp[i][i] = tmp[i-1][i-1] + triangle[i][i];
        }
        for(int i=2; i<triangle.length; i++) {
            for(int j=1; j<i; j++) {
                tmp[i][j] = Math.max(tmp[i-1][j-1], tmp[i-1][j]) + triangle[i][j];
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i=0; i<triangle.length; i++) {
            max = Math.max(max, tmp[tmp.length-1][i]);
        }
        return max;
    }
}