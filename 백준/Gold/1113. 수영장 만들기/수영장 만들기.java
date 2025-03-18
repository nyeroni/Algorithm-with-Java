import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    static class Point {
        int x;
        int y;
        public Point (int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    static Queue<Point> queue = new LinkedList<>();
    static int [][] pool;
    static int N, M;
    static int[] dirX = {-1, 0, 1, 0};
    static int[] dirY = {0, -1, 0, 1};

    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        pool = new int[N][M];
        int s=10, e=0;
        for(int i=0; i<N; i++) {
            String input = br.readLine();
            for(int j=0; j<M; j++) {
                pool[i][j] = input.charAt(j) - '0';
                if(s > pool[i][j]) {
                    s = pool[i][j];
                }
                if(e < pool[i][j]) {
                    e = pool[i][j];
                }
            }
        }
        int answer = 0;

        for(int h=s; h<=e; h++) {
            for(int i=1; i<N-1; i++) {
                for(int j=1; j<M-1; j++) {
                    if(pool[i][j] == h) {
                        answer += bfs(h, i, j);
                    }
                }
            }
        }
        System.out.println(answer);
    }
    private static int bfs(int depth, int x, int y) {
        queue.add(new Point(x, y));
        pool[x][y] = depth + 1;
        boolean isPossible = true;
        int count = 1;

        while(!queue.isEmpty()) {
            Point point = queue.poll();
            for(int i=0; i<4; i++) {
                int nX = point.x + dirX[i];
                int nY = point.y + dirY[i];

                if(!isIn(nX, nY) || pool[nX][nY] < depth) {
                    isPossible = false;
                    continue;
                }
                if(pool[nX][nY] == depth) {
                    pool[nX][nY] = depth + 1;
                    count++;
                    queue.add(new Point(nX, nY));
                }
            }
        }
        return isPossible ? count : 0;
    }
    private static boolean isIn(int x, int y) {
        return x >= 0 && x < N && y >= 0 && y < M;
    }
}