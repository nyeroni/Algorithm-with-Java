import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
   public static void main(String [] args) throws IOException {
       BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(bf.readLine());

       int N = Integer.parseInt(st.nextToken());
       int M = Integer.parseInt(st.nextToken());

       long []arr = new long[N+1];
       st = new StringTokenizer(bf.readLine());
       for(int i=1; i<=N; i++){
           arr[i] = arr[i-1] + Integer.parseInt(st.nextToken());
       }

       for(int t=0; t<M; t++){
           st = new StringTokenizer(bf.readLine());
           int i = Integer.parseInt(st.nextToken());
           int j = Integer.parseInt(st.nextToken());

           System.out.println(arr[j]-arr[i-1]);
       }
   }
}