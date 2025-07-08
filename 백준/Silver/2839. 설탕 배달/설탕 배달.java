import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    public static void main(String []args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        if(n % 5 == 0) {
            count = n/5;
            System.out.println(count);
            return;
        }
        while(n>0) {
            n -= 3;
            count ++;
            if(n % 5 == 0) {
                count += (n/5);
                System.out.println(count);
                return;
            }
        }

        System.out.println(-1);
    }
}