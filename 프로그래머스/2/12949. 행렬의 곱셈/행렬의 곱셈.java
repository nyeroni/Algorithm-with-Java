class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        for(int i=0; i<arr1.length; i++) {
            for(int j=0; j<arr2[0].length; j++) {
                int ans = 0;
                for(int k=0; k<arr1[i].length; k++) {
                    ans += arr1[i][k] * arr2[k][j];
                }
                answer[i][j] = ans;
            }
        }
     
        return answer;
       // 00 * 00 + 01 * 10      00 * 10 + 01 * 11
        //13     33
        //32     33
        //41
    }
}