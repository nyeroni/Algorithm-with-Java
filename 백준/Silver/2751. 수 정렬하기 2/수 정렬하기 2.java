import java.io.*;

public class Main {
    public static int[] arr, tmp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N];
        tmp = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        mergeSort(0, N-1);
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void mergeSort(int s, int e) {
        if(e-s < 1) return;
        int m = (s+e)/2;

        mergeSort(s, m);
        mergeSort(m+1, e);
        for(int i = s; i <= e; i++) {
            tmp[i] = arr[i];
        }
        int index1 = s;
        int index2 = m+1;
        int k = s;
        while(index1 <= m && index2 <= e) {
            if(tmp[index1] > tmp[index2]) {
                arr[k] = tmp[index2];
                index2 ++;
                k++;
            } else {
                arr[k] = tmp[index1];
                index1 ++;
                k++;
            }
        }
        while(index1 <= m) {
            arr[k] = tmp[index1];
            index1 ++;
            k++;
        }
        while(index2 <= e) {
            arr[k] = tmp[index2];
            index2 ++;
            k++;
        }
    }
}