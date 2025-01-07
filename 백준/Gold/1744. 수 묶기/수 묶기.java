import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> minuspq = new PriorityQueue<>();
        PriorityQueue<Integer> pluspq = new PriorityQueue<>(Collections.reverseOrder());
        int one = 0;
        int zero = 0;
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num > 1) {
                pluspq.add(num);
            }
            else if(num == 1) {
                one ++;
            }
            else if(num == 0) {
                zero++;
            }
            else {
                minuspq.add(num);
            }
        }
        int sum = 0;
        while(pluspq.size() > 1) {
            int first = pluspq.remove();
            int second = pluspq.remove();
            sum = sum + first * second;
        }
        if(!pluspq.isEmpty()) {
            sum = sum + pluspq.remove();
        }
        while(minuspq.size() > 1) {
            int first = minuspq.remove();
            int second = minuspq.remove();
            sum = sum + first * second;
        }
        if(!minuspq.isEmpty()) {
            if(zero == 0) {
                sum = sum + minuspq.remove();
            }
        }
        sum = sum + one;
        System.out.println(sum);
    }
}