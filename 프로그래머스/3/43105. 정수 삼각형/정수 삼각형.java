import java.util.*;

class Solution {
    public int solution(int[][] triangle) {
        for(int i=1; i<triangle.length; i++) {
            for(int j=0; j<triangle[i].length; j++) {
                if(j==0) {
                    triangle[i][j] += triangle[i-1][j];
                } else if(j==triangle[i].length-1) {
                    triangle[i][j] += triangle[i-1][j-1];
                } else {
                    triangle[i][j] += Math.max(triangle[i-1][j], triangle[i-1][j-1]);
                }
            }
        }
        int max = 0;
        for(int num : triangle[triangle.length-1]) {
            if(max < num) max = num;
        }
        return max;
    }
}