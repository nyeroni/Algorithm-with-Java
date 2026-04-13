class Solution {
    public int solution(int[][] sizes) {
        int maxX = 0;
        int maxY = 0;
        for(int[] size : sizes) {
            maxX = Math.max(Math.max(size[0], size[1]), maxX);
            maxY = Math.max(Math.min(size[0], size[1]), maxY);
        }
        return maxX * maxY;
    }
}
