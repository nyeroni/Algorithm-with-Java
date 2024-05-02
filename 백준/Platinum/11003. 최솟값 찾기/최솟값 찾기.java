import org.w3c.dom.Node;

import java.util.*;
import java.io.*;

public class Main {
   public static void main(String [] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

       StringTokenizer st = new StringTokenizer(br.readLine());

       int N, L;
       N = Integer.parseInt(st.nextToken());
       L = Integer.parseInt(st.nextToken());

       st = new StringTokenizer(br.readLine());

       Deque<Node> deque = new LinkedList<>();

       for(int i = 0; i < N; i++) {
           int num = Integer.parseInt(st.nextToken());

           while(!deque.isEmpty() && deque.getLast().value > num){
               deque.removeLast();
           }
           deque.addLast(new Node(num, i));

           if(deque.getFirst().index <= i - L) {
               deque.removeFirst();
           }
           bw.write(deque.getFirst().value + " ");
       }
       bw.flush();
       bw.close();

   }
   static class Node {
       public int index;
       public int value;

       Node(int value, int index) {
           this.value = value;
           this.index = index;
       }
   }
}