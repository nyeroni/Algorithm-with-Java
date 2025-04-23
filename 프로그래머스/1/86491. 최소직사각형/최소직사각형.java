class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        for(int i=0; i<sizes.length; i++) {
            if(sizes[i][0] > sizes[i][1]) {
                int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
        }
        int max1 = -1, max2 = -1;
        for(int i=0; i<sizes.length; i++) {
            max1 = Math.max(max1, sizes[i][0]);
            max2 = Math.max(max2, sizes[i][1]);
        }
        answer = max1 * max2;
        return answer;
    }
}