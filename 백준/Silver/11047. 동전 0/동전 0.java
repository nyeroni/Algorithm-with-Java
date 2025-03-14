import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int []A = new int[N];
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            A[i] = Integer.parseInt(st.nextToken());
        }
        int count = 0;
        for(int i=N-1; i>=0; i--) {
            if(A[i] <= K) {
                count += (K/A[i]);
                K = K%A[i];
            }
        }
        System.out.println(count);
    }
}