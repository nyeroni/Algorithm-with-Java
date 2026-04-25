import java.util.*;

class Solution {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public int solution(String[] board) {
        int n = board.length;
        int m = board[0].length();
        int[] start = find(board, 'R');
        int answer = 0;
        
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];
        queue.offer(new int[]{start[0], start[1], 0});
        visited[start[0]][start[1]] = true;
        while(!queue.isEmpty()) {
            int[] now = queue.poll();
            int x = now[0];
            int y = now[1];
            int dist = now[2];
            if(board[x].charAt(y) == 'G') return dist;
            for(int i=0; i<4; i++) {
                int nx = x;
                int ny = y;
                while(true) {
                    int tx = nx + dx[i];
                    int ty = ny + dy[i];
                    if(tx < 0 || tx >= n ||ty < 0 || ty >= m) {
                        break;
                    }
                    if(board[tx].charAt(ty) == 'D') {
                        break;
                    }
                    nx = tx;
                    ny = ty;
                }
                if(!visited[nx][ny]) {
                    visited[nx][ny] = true;
                    queue.offer(new int[]{nx, ny, dist + 1});
                }
            }
        }
        return -1;
    }
    public int[] find(String[] board, Character findIndex) {
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[0].length(); j++) {
                if(board[i].charAt(j) == findIndex) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0, 0};
    }
}