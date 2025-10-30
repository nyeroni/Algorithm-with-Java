class Solution {
    static int cnt = 0;
    public int solution(int[] numbers, int target) {
        boolean[] visited = new boolean[numbers.length];
        dfs(numbers, 0, target, 0);
        return cnt;
    }
    private void dfs(int[] numbers, int num, int target, int depth) {
        if(depth == numbers.length) {
            if(num == target) cnt ++;
            return;
        }
        dfs(numbers, num + numbers[depth], target, depth + 1);
        dfs(numbers, num - numbers[depth], target, depth + 1);
    }
}