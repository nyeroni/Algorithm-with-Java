class Solution {
    public double solution(int[] arr) {
        long sum = 0;
        for(int n : arr) {
            sum += n;
        }
        return (double)sum / (double)arr.length;
    }
}