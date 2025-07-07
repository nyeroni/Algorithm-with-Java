import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0; i<n; i++) {
            int num = Integer.parseInt(br.readLine());
            if(!pq.isEmpty() && num == 0) {
                System.out.println(pq.poll());
            }
            else if (num > 0)
                pq.add(num);
            else if (pq.isEmpty() && num == 0) {
                System.out.println("0");
            }
        }
    }
}