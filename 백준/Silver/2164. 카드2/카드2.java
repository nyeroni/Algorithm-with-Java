import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < N; i++) {
            queue.add(i+1);
        }
        while(queue.size() != 1) {
            queue.poll();
            int n = queue.poll();
            queue.add(n);
        }
        System.out.println(queue.poll());
    }
}