import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer>[] A;
    static boolean[] visited;
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        A = new ArrayList[N+1];
        for(int i=1; i<=N; i++) {
            A[i] = new ArrayList<Integer>();
        }
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[s].add(e);
            A[e].add(s);
        }
        for(int i=1; i<=N; i++) {
            Collections.sort(A[i]);
        }
        visited = new boolean[N+1];
        DFS(V);
        System.out.println();
        visited = new boolean[N+1];
        BFS(V);
        System.out.println();
    }
    public static void DFS(int start) {
        System.out.print(start + " ");
        visited[start] = true;
        for(int i : A[start]) {
            if(!visited[i]) {
                visited[i] = true;
                DFS(i);
            }
        }
    }
    public static void BFS(int start) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(start);
        visited[start] = true;

        while(!queue.isEmpty()) {
            int cur = queue.poll();
            System.out.print(cur + " ");
            for(int i : A[cur]) {
                if(!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}