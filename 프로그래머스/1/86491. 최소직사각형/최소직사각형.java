class Solution {
    public int solution(int[][] sizes) {
        int answer = 1;
        int max = -1;
        int k=-1;
        for(int i=0; i<sizes.length; i++) {
            if(max < Math.max(sizes[i][0], sizes[i][1])) {
                max = Math.max(sizes[i][0], sizes[i][1]);
                k = i;
            }
        }
        answer *= max;
        System.out.println("max = " + max);
        max = -1;
        for(int i=0; i<sizes.length; i++) {
            if(max < Math.min(sizes[i][0], sizes[i][1])) {
                max = Math.min(sizes[i][0], sizes[i][1]);
                System.out.println("max = " + max);
                k = i;
            }
        }
        answer *= max;
        return answer;
    }
}