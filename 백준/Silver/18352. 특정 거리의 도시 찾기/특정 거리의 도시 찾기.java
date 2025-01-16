import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    static int visited[];
    static ArrayList<Integer> []A;
    static int N,M,K,X;
    static List<Integer> answer;
    public static void main(String []args) throws IOException {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        K = sc.nextInt();
        X = sc.nextInt();
        A = new ArrayList[N+1];
        answer = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            A[i] = new ArrayList<>();
        }
        for(int i=0; i<M; i++) {
            int S = sc.nextInt();
            int E = sc.nextInt();
            A[S].add(E);
        }
        visited = new int[N+1];
        for(int i=0; i<=N; i++) {
            visited[i] = -1;
        }
        BFS(X);
        for(int i=0; i<=N; i++) {
            if(visited[i] == K) {
                answer.add(i);
            }
        }
        if(answer.isEmpty()) {
            System.out.println("-1");
        } else {
            Collections.sort(answer);
            for(int tmp:answer) {
                System.out.println(tmp);
            }
        }
    }
    private static void BFS(int x) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(x);
        visited[x] ++;
        while(!queue.isEmpty()) {
            int new_node = queue.poll();
            for(int i: A[new_node]) {
                if(visited[i] == -1) {
                    visited[i] = visited[new_node] + 1;
                    queue.add(i);
                }
            }
        }
    }
}
