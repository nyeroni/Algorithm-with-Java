class Solution {
    int max = 0;
    public int solution(int k, int[][] dungeons) {
        boolean []visited = new boolean[dungeons.length];
        dfs(k, dungeons, visited, 0, 0);
        return max;
    }
    private void dfs(int k, int[][]dungeons, boolean[] visited, int idx, int count) {
        if(idx == dungeons.length ){ 
            max = Math.max(count, max);
        }
        for(int i=0; i<dungeons.length; i++) {
            if(visited[i]) {
                continue;
            }
            visited[i] = true;
            if(dungeons[i][0] <= k) {
                dfs(k-dungeons[i][1], dungeons, visited, idx+1, count + 1);
            } else {
                dfs(k, dungeons, visited, idx+1, count);
            }
            visited[i] = false;
        }
        return ;
    }
}