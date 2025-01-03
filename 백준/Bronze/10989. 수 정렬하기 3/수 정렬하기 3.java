import java.io.*;

public class Main {
    public static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        radixSort(arr, 5);
        br.close();
        for (int i = 0; i < N; i++) {
            bw.write(arr[i] + "\n");
        }
        bw.flush();
        bw.close();
    }
    public static void radixSort(int []arr, int max_size) {
        int []output = new int[arr.length];
        int count = 0;
        int j = 1;
        while(count < max_size) {
            int []bucket = new int[10];
            for(int i=0; i<arr.length; i++) {
                bucket[((arr[i] / j) % 10)]++;
            }
            for (int i = 1; i < 10; i++) {
                bucket[i] += bucket[i-1];
            }
            for(int i=arr.length-1; i>=0; i--) {
                output[bucket[(arr[i] / j) % 10] - 1] = arr[i];
                bucket[(arr[i] / j) % 10] --;
            }
            for(int i=0; i<arr.length; i++) {
                arr[i] = output[i];
            }
            j *= 10;
            count ++;
        }
    }
}