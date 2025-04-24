import java.util.*;
class Solution {
    Map<Integer, List<Integer>> map;
    boolean []visited;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];
        map = new HashMap<>();
        for(int i=0; i<computers.length; i++) {
            map.put(i, new ArrayList<>());
            for(int j=0; j<computers[i].length; j++) {
                if(computers[i][j] == 1 && i != j) {
                    map.get(i).add(j);
                }
            }       
        }
        for(int i : map.keySet()) {
            if(!visited[i]) {
                visited[i] = true;
                dfs(i);
                answer ++;
                // visited[i] = false;
            }
        }
        return answer;
    }
    public void dfs(int num) {
        for(int i : map.get(num)) {
            if(!visited[i]) {
                visited[i] = true;
                dfs(i);
                // visited[i] = false;
            }
        }
        
    }
}