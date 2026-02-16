class Solution {
    public int[] solution(int brown, int yellow) {
        for(int i=1; i<=Math.sqrt(yellow); i++) {
            if(yellow % i == 0) {
                if(i * 2 + (yellow/i + 2) * 2 == brown) {
                    return new int[]{yellow/i + 2, i + 2};
                }
            }
        }   
        return new int[]{0, 0};
    }
}