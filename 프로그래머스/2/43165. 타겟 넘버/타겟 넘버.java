class Solution {
    int cnt = 0;
    public int solution(int[] numbers, int target) {
        boolean[] visited = new boolean[numbers.length];
        dfs(numbers, target, 0, 0);
        return cnt;
    }
    private void dfs(int[] numbers, int target, int sum, int depth) {
        if(depth == numbers.length) {
            if(target == sum) cnt++;
            return;
        }
        dfs(numbers, target, sum + numbers[depth], depth + 1);
        dfs(numbers, target, sum - numbers[depth], depth + 1);
    }
}