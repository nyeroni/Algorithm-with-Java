class Solution {
    int count = 0;
    public int solution(int[] number) {
        dfs(number, 0, 0, 0);
        return count;
    }
    public void dfs(int []number, int start, int depth, int sum) {
        if(depth == 3) {
            if(sum == 0) {
                count ++;
            }
            return;
        }
        for(int i=start; i<number.length; i++) {
            dfs(number, i+1, depth + 1, sum + number[i]);
        }
    }
}