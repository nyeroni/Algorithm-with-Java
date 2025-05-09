import java.util.*;
class Solution {
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};
    int[] lever = new int[2];
    public int solution(String[] maps) {
        int answer = 0;
        String[][] map = new String[maps.length][maps[0].length()];
        boolean[][] visited = new boolean[maps.length][maps[0].length()];
        int[] start = new int[2];
        
        for(int i=0; i<maps.length; i++) {
            String[] tmp = maps[i].split("");
            map[i] = tmp;
            for(int j=0; j<tmp.length; j++) {
                if(tmp[j].equals("S")) {
                    start[0] = i;
                    start[1] = j;
                } 
            }
        }
        int first = bfs(map, visited, start, "L");
        if(first == -1) return -1;
        visited = new boolean[maps.length][maps[0].length()];
        int second = bfs(map, visited, lever, "E");
        if(second == -1) {
            return -1;
        }
        answer = first + second;
        return answer;
    }
    public int bfs(String[][] map, boolean[][] visited, int[] start, String target) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{start[0], start[1], 0});
        visited[0][0] = true;
        while(!queue.isEmpty()) {
            int[] tmp = queue.poll();
            int cR = tmp[0];
            int cC = tmp[1];
            int cnt = tmp[2];
            
            for(int i=0; i<4; i++) {
                int nR = cR + dx[i];
                int nC = cC + dy[i];
                
                if(nR >= 0 && nR < map.length && nC >= 0 && nC < map[0].length) {
                    if(map[nR][nC].equals(target)) {
                        lever[0] = nR;
                        lever[1] = nC;
                        return cnt + 1;
                    }
                    if(!map[nR][nC].equals("X") && !visited[nR][nC]) {
                        visited[nR][nC] = true;
                        queue.add(new int[]{nR, nC, cnt + 1});
                    }
                }
            }
        }
        return -1;
    }
}