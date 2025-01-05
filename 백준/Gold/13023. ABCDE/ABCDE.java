import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static int N;
    public static ArrayList<Integer>[] A;
    public static boolean[] visited;
    public static boolean arrive;
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        A = new ArrayList[N];
        visited = new boolean[N];
        arrive = false;
        for(int i=0; i<N; i++) {
            A[i] = new ArrayList<>();
        }
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            A[a].add(b);
            A[b].add(a);
        }
        for(int i=0; i<N; i++) {
            DFS(i, 1);
            if(arrive) {
                break;
            }
        }
        if(arrive){
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
    }
    public static void DFS(int now, int depth) {
        if(depth == 5 || arrive) {
            arrive = true;
            return;
        }
        visited[now] = true;
        for(int i : A[now]) {
            if(!visited[i]) {
                DFS(i, depth+1);
            }
        }
        visited[now] = false;
    }
}