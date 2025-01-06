import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int start = 1;
        int end = K;
        int ans = 0;
        while(start <= end) {
            int middle = (start + end) / 2;
            int cnt = 0;
            for(int i=1; i<=N; i++) {
                cnt += Math.min(middle/i, N);
            }
            if(cnt < K) {
                start = middle + 1;
            } else {
                end = middle - 1;
                ans  = middle;
            }
        }
        System.out.println(ans);
    }
}