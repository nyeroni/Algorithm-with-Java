class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        for(int i=0; i<arr1.length; i++) {
            for(int j=0; j<arr2[0].length; j++) {
                int sum = 0;
                for(int k=0; k<arr1[0].length; k++) {
                    sum += arr1[i][k] * arr2[k][j];
                }
                answer[i][j] = sum;
            }
        }
        return answer;
        // 1 4    3 3  00*00 + 01*10     00*01 + 01*11
        // 3 2    3 3  10*00 + 10*10     
        // 4 1    
        
        // 15 15
        // 15 15
        // 15 15
        
    }
}