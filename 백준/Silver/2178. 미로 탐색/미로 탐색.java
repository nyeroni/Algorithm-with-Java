import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int M;
    static boolean[][] visited;
    static int [][]A;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        A = new int[N][M];
        visited = new boolean[N][M];
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            for(int j=0; j<M; j++) {
                A[i][j] = Integer.parseInt(line.substring(j, j+1));
            }
        }
        BFS(0, 0);
        System.out.println(A[N-1][M-1]);

    }
    private static void BFS(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {i, j});
        visited[i][j] = true;
        while(!queue.isEmpty()) {
            int cur[] = queue.poll();;
            for(int k=0; k<4; k++) {
                int x = cur[0] + dx[k];
                int y = cur[1] + dy[k];
                if(x >= 0 && y >= 0 && x < N && y < M ) {
                    if(!visited[x][y] && A[x][y] != 0) {
                        visited[x][y] = true;
                        A[x][y] = A[cur[0]][cur[1]]+1;
                        queue.add(new int[] {x, y});
                    }
                }
            }

        }
    }
}