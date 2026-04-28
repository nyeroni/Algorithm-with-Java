import java.util.*;

class Solution {
    public int solution(int n, int[][] results) {
        boolean[][] win = new boolean[n+1][n+1];
        for(int[] result : results) {
            int winner = result[0];
            int loser = result[1];
            
            win[winner][loser] = true;
        }
        for(int mid = 1; mid<=n; mid ++) {
            for(int a = 1; a<=n; a++) {
                for(int b=1; b<=n; b++) {
                    if(win[a][mid] && win[mid][b]) {
                        win[a][b] = true;
                    }
                }
            }
        }
        int answer = 0;
        for(int i=1; i<=n; i++) {
            int count = 0;
            for(int j=1; j<=n; j++) {
                if(i==j) continue;
                if(win[i][j] || win[j][i]) {
                    count ++;
                }
            }
            if(count == n-1) {
                answer ++;
            }
        }
        return answer;
    }
}