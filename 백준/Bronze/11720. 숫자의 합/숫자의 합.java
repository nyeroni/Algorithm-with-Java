import java.util.*;
import java.io.*;

public class Main {

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String str = scanner.next();
        char [] c = str.toCharArray();

        int sum = 0;

        for(int i=0; i<N; i++) {
            sum += c[i] - '0';
        }

        System.out.println(sum);
    }
}