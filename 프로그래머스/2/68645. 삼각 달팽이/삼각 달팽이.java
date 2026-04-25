import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] dr = {1, 0, -1};
        int[] dc = {0, 1, -1};
        // 00 10 11 20 21 22
        int row = -1;
        int col = 0;
        int idx = 0;
        int cnt = 1;
        int[][] arr = new int[n][n];
        for(int i=n; i>0; i--) {
            for(int j=0; j<i; j++) {
                row += dr[idx];
                col += dc[idx];
                arr[row][col] = cnt ++;
            }
            idx = (idx + 1) % 3;
        }
        int[] answer = new int[(n * (n+1)) / 2];
        idx = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++) {
                if(arr[i][j] != 0) {
                    answer[idx ++] = arr[i][j];
                }
            }   
        }
        return answer;
    }
}