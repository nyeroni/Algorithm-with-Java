import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int [][]A = new int[N][M];
        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        M = sc.nextInt();
        int K = sc.nextInt();
        int [][]B = new int[M][K];

        for(int i=0; i<M; i++) {
            for(int j=0; j<K; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        int [][]newArr = new int[N][K];

        /*
        00 00 + 00 01
        00 10 + 00 11
        00 20 + 00 21
        10 00 + 10 01
        10 10 + 10 11
        -> 0 0 -> 0 0 -> 0 0 -> 1 1 -> 1 1
        -> 0 0 -> 0 0 -> 0 0 -> 0 0 -> 0 0 ->
        0 0 -> 1 1 -> 2 2 -> 0 0 -> 1 1 -> 2 2 ->
        0 1 -> 0 1 -> 0 1 ->
        * */

        for(int i=0; i<N; i++) {
            for(int h=0; h<K; h++) {
                int sum = 0;
                for(int j=0; j<M; j++) {
                    sum += A[i][j] * B[j][h];
                }
                newArr[i][h] = sum;
            }
        }
        for(int i=0; i<N; i++) {
            for(int j=0; j<K; j++) {
                System.out.print(newArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}