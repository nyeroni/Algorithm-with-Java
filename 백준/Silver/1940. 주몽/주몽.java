import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
   public static void main(String [] args) throws IOException {

       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int M = sc.nextInt();
       int []arr = new int[N];
       for(int i=0; i<N; i++){
           arr[i] = sc.nextInt();
       }
       int cnt = 0;
       Arrays.sort(arr);
       int i=0, j=N-1;
       while(i<j){
           if(arr[i] + arr[j] == M){
               cnt++;
               i++; j--;
           }
           else if(arr[i] + arr[j] <M){
               i++;
           }
           else{
               j--;
           }
       }
       System.out.println(cnt);

   }
}