import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0, num;
        int index = 0;
        for(int i=0; i<9; i++) {
            num = Integer.parseInt(br.readLine());
            if(num > max) {
                max = num;
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index + 1);
    }
}