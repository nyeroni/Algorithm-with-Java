import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
   public static void main(String [] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        long []arr = new long[N];

       arr[0]  = sc.nextInt();
       for(int i=1; i<N; i++){
            arr[i] = arr[i-1] + sc.nextInt();
        }
       long []C = new long[M];
       long cnt = 0;
       for(int i=0; i<N; i++){
           int tmp = (int) (arr[i] % M);
           if(tmp == 0 ) cnt ++;
           C[tmp] ++;
       }
       for (int i=0; i<M; i++){
           if(C[i]>1) {
               cnt += ((C[i] * (C[i]-1))/2);
           }
       }
       System.out.println(cnt);

   }
}