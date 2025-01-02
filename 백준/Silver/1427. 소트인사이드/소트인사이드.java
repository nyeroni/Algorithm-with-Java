import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        int []arr = new int[N.length()];
        for (int i=0; i<N.length(); i++) {
            arr[i] = N.charAt(i) - '0';
        }
        for (int i=0; i <N.length(); i++) {
            int max = 0;
            int index = 0;
            for (int j=i; j<N.length(); j++) {
                if(arr[j] >= max) {
                    max = arr[j];
                    index = j;
                }
            }
            int tmp = arr[i];
            arr[i] = max;
            arr[index] = tmp;
        }
        for (int i=0; i<N.length(); i++) {
            System.out.print(arr[i]);
        }
    }
}