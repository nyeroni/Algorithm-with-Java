import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        int arr[][] = new int[N][3];
        int max = 1000*1000 + 1;
        int answer = max;
        
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());
        }
        
        for(int start = 0; start <= 2; start++) {
            int dp[][] = new int[N][3];
            
            for(int j = 0; j <= 2; j++) {
                if(start == j) {
                    dp[0][start] = arr[0][start];
                } else {
                    dp[0][j] = max;
                }
            }
            
            for(int i = 1; i < N; i++) {
                dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + arr[i][0];
                dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + arr[i][1];
                dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + arr[i][2];
            }
            
            for(int j = 0; j <= 2; j++) {
                if(start != j){
                    answer = Math.min(answer, dp[N-1][j]);
                }
            }
        }
        
        System.out.println(answer);
        
    }
}