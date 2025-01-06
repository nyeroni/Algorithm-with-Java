import java.io.*;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int []A = new int[N];
        int start = 0;
        int end = 0;
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
            if(start < A[i]) {
                start = A[i];
            }
            end = end + A[i];
        }
        while(start <= end) {
            int middle = (start + end) / 2;
            int sum = 0;
            int count = 0;

            for(int i = 0; i < N; i++) {
                if(sum + A[i] > middle) {
                    count ++;
                    sum = 0;
                }
                sum = sum + A[i];
            }
            if(sum != 0) {
                count ++;
            }
            if(count > M) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        System.out.println(start);
    }
}