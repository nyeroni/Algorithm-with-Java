class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = countBrown(brown, yellow);
        return answer;
    }
    private int[] countBrown(int brown, int yellow) {
        int x = 0, y=0;
        int count = 0;
        while(count != brown) {
            x ++;
            if(yellow%x == 0) {
                y = yellow/x;
            } else continue;
            System.out.println("X : " + x);
            System.out.println("Y : " + y);
            count = x * 2 + (y+2) * 2;
            if(count == brown) {
                return new int[] {y+2, x+2} ;
            }
        }
        return new int[] {0, 0};
    }
}