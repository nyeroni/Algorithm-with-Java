import java.util.Scanner;

public class Main {
   public static void main(String [] args) {

       Scanner sc = new Scanner(System.in);
       int M = sc.nextInt();
       int max = 0;
       int[] arr = new int[1001];
       double sum = 0;
       for (int i = 0; i < M; i++) {
           arr[i] = sc.nextInt();
           if (arr[i] > max) {
               max = arr[i];
           }
       }

       for (int i = 0; i < M; i++) {
           sum += ((double) arr[i]/max)*100;
       }
       System.out.println(sum/(double) M);
   }
}