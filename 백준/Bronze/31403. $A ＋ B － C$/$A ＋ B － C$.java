import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    public static void main(String []args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result1 = a + b - c;
        int result2 = Integer.parseInt(String.valueOf(a) + String.valueOf(b)) - c;

        System.out.println(result1);
        System.out.println(result2);
    }
}