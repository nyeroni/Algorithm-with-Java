import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = {64, 32, 16, 8, 4, 2, 1};
        int count = 0;
        int sum = 0;
        for(int i=0; i<7; i++) {
            if(arr[i] <= n) {
                sum += arr[i];
                count++;
            }
            if(sum > n) {
                sum -= arr[i];
                count--;
            }
            if(sum == n) break;
        }

        System.out.println(count);
    }
}