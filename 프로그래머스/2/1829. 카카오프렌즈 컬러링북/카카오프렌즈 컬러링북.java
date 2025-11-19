import java.util.*;
class Solution {
    static int[] dx;
    static int[] dy;
    static int numberOfArea;
    static int maxSizeOfOneArea;
    static int mm;
    static int nn;
    static boolean[][] visited;
    public int[] solution(int m, int n, int[][] picture) {
        mm = m;
        nn = n;
        numberOfArea = 0;
        maxSizeOfOneArea = 0;
        dx = new int[]{1, -1, 0, 0};
        dy = new int[]{0, 0, 1, -1};
        int[] answer = new int[2];
        visited = new boolean[m][n];
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(!visited[i][j] && picture[i][j] != 0) {
                    numberOfArea ++;
                    // System.out.println("i : " + i + ", j : " + j);
                    int size = dfs(i, j, picture[i][j], picture);
                    maxSizeOfOneArea = Math.max(maxSizeOfOneArea, size);
                }
            }
        }
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;

        return answer;
    }
    private int dfs(int x, int y, int num, int[][] picture) {
        visited[x][y] = true;
        int sum = 1;
        for(int i=0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx < 0 || nx >= mm || ny < 0 || ny >= nn) {
                continue;
            }
            if(!visited[nx][ny] && picture[nx][ny] == num) sum += dfs(nx, ny, num, picture);
        }
        return sum;
    }
    // 1, 1, 1, 0
    // 1, 1, 1, 0
    // 0, 0, 0, 1
    // 0, 0, 0, 1
    // 0, 0, 0, 1
    // 0, 0, 0, 1


    // 1, 1, 1, 0
    // 1, 2, 2, 0
    // 1, 0, 0, 1
    // 0, 0, 0, 1
    // 0, 0, 0, 3
    // 0, 0, 0, 3


}