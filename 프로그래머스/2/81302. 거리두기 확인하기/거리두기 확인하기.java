import java.util.*;

class Solution {
    private static final int[] dr = {-1, 1, 0, 0};
    private static final int[] dc = {0, 0, -1, 1};
    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];
        for(int i=0; i<places.length; i++) {
            answer[i] = checkPlace(places[i]) ? 1 : 0;
        }
        
        return answer;
    }
    private boolean checkPlace(String[] place) {
        char[][] room = new char[5][5];
        for(int r=0; r<5; r++) {
            room[r] = place[r].toCharArray();
        }
        for(int r=0; r<5; r++) {
            for(int c=0; c<5; c++) {
                if(room[r][c] == 'P') {
                    if(!isSafeFromPosition(room, r, c)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    private boolean isSafeFromPosition(char[][] room, int sr, int sc) {
        boolean[][] visited = new boolean[5][5];
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(sr, sc, 0));
        visited[sr][sc] = true;
        
        while(!q.isEmpty()) {
            Node cur = q.poll();
            int r = cur.r;
            int c = cur.c;
            int dist = cur.dist;
            
            if(dist > 0 && room[r][c] == 'P') return false;
            if(dist == 2) continue;
            
            for(int d=0; d<4; d++) {
                int nr = r + dr[d];
                int nc = c + dc[d];
                
                if(nr < 0 || nr >= 5 || nc < 0 || nc >= 5) continue;
                if(visited[nr][nc]) continue;
                if(room[nr][nc] == 'X') continue;
                visited[nr][nc] = true;
                q.offer(new Node(nr, nc, dist+1));
            }
        }
        return true;
    }
    public static class Node {
        int r, c, dist;
        public Node(int r, int c, int dist) {
            this.r = r;
            this.c = c;
            this.dist = dist;
        }
    }
}