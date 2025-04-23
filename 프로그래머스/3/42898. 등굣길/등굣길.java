class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        int MOD = 1000000007;
        int [][] tmp = new int[n][m];
        
        for(int i=0; i<puddles.length; i++) {
            tmp[puddles[i][1]-1][puddles[i][0]-1] = -1;
        }
        
        tmp[0][0] = 1;
        for(int i=1; i<m; i++) {
            if(tmp[0][i] == -1 || tmp[0][i-1] == -1) {
                break;
            }
            else tmp[0][i] = 1;
        }
        for(int i=1; i<n; i++) {
            if(tmp[i][0] == -1 || tmp[i-1][0] == -1) {
                break;
            }
            else tmp[i][0] = 1; 
        }
        for(int i=1; i<n; i++) {
            for(int j=1; j<m; j++){
                if(tmp[i][j] == -1) {
                    continue;
                }
                if(tmp[i-1][j] == -1) {
                    tmp[i][j] = tmp[i][j-1];
                } else if(tmp[i][j-1] == -1) {
                    tmp[i][j] = tmp[i-1][j];
                }
                else {
                    tmp[i][j] = (tmp[i-1][j] % MOD + tmp[i][j-1] % MOD) % MOD;
                }
            }
        }
        return tmp[n-1][m-1]%MOD;
    }
}