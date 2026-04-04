class Solution {
    public int[] solution(int brown, int yellow) {
        // x * 2 + (y-2) * 2 = brown
        // (x-2) * (y-2) = yellow
        // x + y - 2 = brown/2
        // x + y = brown/2 + 2
        // xy -2x -2y + 4 = yellow
        // xy = yellow - 4 + 2(x+y)
        // xy = yellow - 4 + brown + 4
        // xy = yellow + brown
        int num = brown + yellow;
        int x = 1;
        for(int i=1; i<=Math.sqrt(num); i++) {
            if(num % i == 0 && i + num/i - 2 == brown / 2) {
                x = i;
                break;
            }
        }
        x = Math.max(x, num/x);
        return new int[]{x, num/x};
        
    }
}