import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    public static char [][] tmp;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        tmp = new char[n][m];
        for(int i=0; i<n; i++) {
            String s = sc.next();
            for(int j=0; j<m; j++) {
                tmp[i][j] = s.charAt(j);
            }
        }
        int ans = 1000000;
        for (int i = 0; i < n-7; i++) {
            for (int j = 0; j < m-7; j++) {
                ans = Math.min(ans, solution(i, j));
            }
        }
        System.out.println(ans);
    }
    public static int solution(int x, int y) {
        int B = 0;
        int W = 0;

        for(int i=x;  i<8+x; i++) {
            for(int j=y; j<8+y; j++) {
                if((i + j) % 2 ==0) {
                    if(tmp[i][j] == 'B') {
                        W++;
                    } else B++;
                } else {
                    if(tmp[i][j] == 'W') {
                        W++;
                    } else B++;
                }
            }
        }
        return Math.min(B, W);
    }
}