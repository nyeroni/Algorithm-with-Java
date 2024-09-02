import java.util.*;
import java.io.*;

public class Main {

    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int [] arr = new int[N];
        int max = 0;
        double sum = 0;
        double avg = 0;

        for(int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        for (int i = 0; i < N; i++) {
            sum += (double) arr[i] / max * 100;
        }

        avg = sum/(double) N;

        System.out.println(avg);
    }
}