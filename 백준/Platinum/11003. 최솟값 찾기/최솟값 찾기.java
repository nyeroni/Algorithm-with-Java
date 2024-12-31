import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        Deque<Node> myQueue = new LinkedList<>();
        for (int i= 0; i<N; i++) {
            int num =  Integer.parseInt(st.nextToken());
            while(!myQueue.isEmpty() && myQueue.getLast().value > num) {
                myQueue.removeLast();
            }
            myQueue.addLast(new Node(num, i));
            if (myQueue.getFirst().index <= i-L) {
                myQueue.removeFirst();
            }
            bw.write(myQueue.getFirst().value + " ");
        }
        bw.flush();
        bw.close();
    }
    private static class Node {
        public int value;
        public int index;
        Node(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }
}