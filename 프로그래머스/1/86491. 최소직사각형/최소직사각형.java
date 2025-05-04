import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxX = 0;
        int maxY = 0;
        for(int i=0; i<sizes.length; i++) {
            Arrays.sort(sizes[i]);
            if(maxX < sizes[i][1]) {
                maxX = sizes[i][1];
            } 
            if(maxY < sizes[i][0]) {
                maxY = sizes[i][0];
            }
        }
        
        return maxX * maxY;
    }
}