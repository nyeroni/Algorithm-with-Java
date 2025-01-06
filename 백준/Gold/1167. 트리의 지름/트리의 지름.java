import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static boolean[] visited;
    static int[] distance;
    static ArrayList<Edge>[] A;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        A = new ArrayList[N+1];
        for(int i=1; i<=N; i++) {
            A[i] = new ArrayList<>();
        }
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            while(true) {
                int E = Integer.parseInt(st.nextToken());
                if(E == -1) break;
                int V = Integer.parseInt(st.nextToken());
                A[S].add(new Edge(E, V));
            }
        }
        distance = new int[N+1];
        visited = new boolean[N+1];
        int max = 1;
        BFS(1);
        for(int i = 2; i<=N; i++) {
            if(distance[i] > distance[max]) {
                max = i;
            }
        }
        distance = new int[N+1];
        visited = new boolean[N+1];
        BFS(max);
        Arrays.sort(distance);
        System.out.println(distance[N]);
    }
    private static void BFS(int index) {
        Queue<Integer> q = new LinkedList<>();
        q.add(index);
        visited[index] = true;
        while(!q.isEmpty()) {
            int cur = q.poll();
            for(Edge i : A[cur]) {
                int e = i.e;
                int v = i.value;
                if(!visited[e]) {
                    visited[e] = true;
                    q.add(e);
                    distance[e] = distance[cur] + v;
                }
            }
        }
    }
}
class Edge {
    public int e;
    public int value;
    public Edge(int e, int value) {
        this.e = e;
        this.value = value;

    }
}
