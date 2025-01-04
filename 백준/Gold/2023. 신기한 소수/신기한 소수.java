import java.io.*;
import java.util.Scanner;

public class Main {
    public static int N;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        DFS(2, 1);
        DFS(3, 1);
        DFS(5, 1);
        DFS(7, 1);
    }
    public static void DFS(int u, int v) {
        if(v == N) {
            if(isPrime(u)) {
                System.out.println(u);
            }
            return;
        }
        for(int i=1; i<10; i++) {
            if(i%2 == 0) {
                continue;
            }
            if(isPrime(u * 10 + i)) {
                DFS(u * 10 + i, v+1);
            }
        }
    }
    public static boolean isPrime(int num) {
        for(int i=2; i<=num/2; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}