class Solution {
    public int[] solution(int brown, int yellow) {
        return count(brown, yellow);
    }
    private int[] count(int brown, int yellow) {
        // brown = 2*x + 2*y - 4
        // yellow = (x-2) * (y-2)
        //brow + yellow = x * y;
        int sum = brown + yellow;
        for(int i=1; i<=Math.sqrt(sum); i++) {
            if(sum % i == 0) {
                int x = i;
                int y = sum / x;
                if( 2 * x + 2 * y - 4 == brown && (x-2) * (y-2) == yellow) {
                    return new int[]{y, x};
                }
            }
        }
        return new int[]{0, 0};
    }
}