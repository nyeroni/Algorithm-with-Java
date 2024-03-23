import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
   public static void main(String [] args) throws IOException {

       Scanner sc = new Scanner(System.in);

       int N = sc.nextInt();
       int []arr = new int[N];
       for(int k=0; k<N; k++){
           arr[k] = sc.nextInt();
       }
       Arrays.sort(arr);
       int cnt = 0;
       for(int k=0; k<N; k++){
           int M = arr[k];
           int i=0, j= N-1;
           while(i<j){
               if(arr[i] + arr[j] == M){
                   if(i!=k && j!=k){
                       cnt ++;
                       break;
                   }
                   else if(i==k){
                       i++;
                   }else if(j==k){
                       j--;
                   }
                   
               }
               else if(arr[i] + arr[j] <M){
                   i++;
               }
               else{
                   j--;
               }
           }

       }
       System.out.println(cnt);
   }
}