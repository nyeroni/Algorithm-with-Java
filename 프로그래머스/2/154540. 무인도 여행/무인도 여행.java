import java.util.*;

class Solution {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static boolean[][] visited;
    public int[] solution(String[] maps) {
        visited = new boolean[maps.length][maps[0].length()];
        int cnt = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<maps.length; i++) {
            for(int j=0; j<maps[i].length(); j++) {
                if(!visited[i][j] && maps[i].charAt(j) != 'X') {
                    cnt = dfs(i, j, maps);
                    // System.out.println("cnt : " + cnt);
                    list.add(cnt);
                    cnt = 0;
                }
            }
        }
        if(list.size() == 0) return new int[]{-1};
        int[] answer = list.stream().mapToInt(i->i).toArray();
        Arrays.sort(answer);
        return answer;
    }
    private int dfs(int x, int y, String[] maps) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        visited[x][y] = true;
        // System.out.println("start x : " + x + ", y : "+ y);
        int sum=Integer.parseInt(String.valueOf(maps[x].charAt(y)));
        while(!queue.isEmpty()) {
            int[] now = queue.poll();
            int nowx = now[0];
            int nowy = now[1];
            // // System.out.println("x : " + x + ", y : " + y);
            // System.out.println("sum : " + sum );
            for(int i=0; i<4; i++) {
                int nx = nowx+dx[i];
                int ny = nowy+dy[i];
                
                if(nx<0 || ny < 0 || nx >= maps.length || ny >= maps[0].length()) {
                    continue;
                }
                if(visited[nx][ny] || maps[nx].charAt(ny) == 'X') continue;
                visited[nx][ny] = true;
                queue.offer(new int[]{nx, ny});
                sum += Integer.parseInt(String.valueOf(maps[nx].charAt(ny)));

            }
        }
        return sum;
    }
}