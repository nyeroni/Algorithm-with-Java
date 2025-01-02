import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int [] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        quickSort(arr, 0, N-1, K-1);
        System.out.println(arr[K-1]);
    }
    public static void quickSort(int[] arr, int S, int E, int K) {
        if(S < E) {
            int pivot = partition(arr, S, E);
            if(pivot == K) {
                return;
            } else if (pivot < K) {
                quickSort(arr, pivot + 1, E, K);
            } else {
                quickSort(arr, S, pivot - 1, K);
            }
        }
    }
    public static int partition(int [] arr, int S, int E) {
        if(S+1 == E) {
            if(arr[S] > arr[E]) {
                swap(arr, S, E);
            }
            return E;
        }
        int M = (S + E) / 2;
        swap(arr, S, M);
        int pivot = arr[S];
        int i = S + 1;
        int j = E;
        while(i<=j) {
            while(j >= S+1 && arr[j] > pivot) {
                j--;
            }
            while(i <= E && arr[i] < pivot) {
                i++;
            }
            if(i<=j) {
                swap(arr, i++, j--);
            }
        }
        arr[S] = arr[j];
        arr[j] = pivot;
        return j;
    }
    public static void swap(int []arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}