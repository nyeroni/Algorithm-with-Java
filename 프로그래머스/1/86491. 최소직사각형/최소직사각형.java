class Solution {
    public int solution(int[][] sizes) {
        int maxX = 0;
        int maxY = 0;
        for(int[] size : sizes) {
            int max = Math.max(size[0], size[1]);
            int min = Math.min(size[0], size[1]);
            if(max > maxX) maxX = max;
            if(min > maxY) maxY = min;
        }
        
        return maxX * maxY;
    }
}
