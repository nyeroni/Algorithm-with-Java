class Solution {
    public int[] solution(int brown, int yellow) {
        // x * 2 + (y-2) * 2 = brown
        // (x-2) * (y-2) = yellow
        // brown * yellow 의 약수 1, 2, 3, 4, 6, 12
        int total = brown + yellow;
        for(int i=3; i<= Math.sqrt(total); i++) {
            if(total % i == 0) {
                if((i-2) * (total/i - 2) == yellow && total/i * 2 + (i-2) * 2 == brown) {
                    
                    return new int[]{total/i, i};
                }
            }
        }
        return new int[]{0, 0};
    }
}