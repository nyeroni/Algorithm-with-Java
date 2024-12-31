import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        int []A = new int[N];
        int [] answer = new int[N];
        Stack<Integer> stack = new Stack<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        stack.push(0);
        for (int i = 1; i < N; i++) {
            while(!stack.empty() && A[stack.peek()] < A[i]) {
                answer[stack.pop()] = A[i];
            }
            stack.push(i);
        }
        while(!stack.empty()) {
            answer[stack.pop()] = -1;
        }
        for (int i = 0; i < N; i++) {
            bw.write(answer[i] + " ");
        }
        bw.write("\n");
        bw.flush();

    }
}