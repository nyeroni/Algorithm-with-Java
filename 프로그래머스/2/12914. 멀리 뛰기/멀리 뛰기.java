class Solution {
    public long solution(int n) {
        long[] dp = new long[n + 2];
        dp[0] = 1;
        dp[1] = 1;
        int mod = 1234567;

        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % mod;
        }

        return dp[n];
    }
}
