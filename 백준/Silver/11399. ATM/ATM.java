import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];
        int[] result = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 1; i < N; i++) {
            int index = i;
            int num = arr[i];
            for(int j = i-1; j >= 0; j--) {
                if(arr[i] > arr[j]) {
                    index = j+1;
                    break;
                }
                if(j == 0) {
                    index = 0;
                }
            }
            for(int j = i; j > index; j--) {
                arr[j] = arr[j-1];
            }
            arr[index] = num;
        }
        result[0] = arr[0];
        for(int i = 1; i < N; i++) {
            result[i] = result[i-1] + arr[i];
        }
        int sum = 0;
        for(int i = 0; i < N; i++) {
            sum += result[i];
        }
        System.out.println(sum);
    }
}