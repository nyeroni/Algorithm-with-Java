class Solution {
    public int solution(int[] date1, int[] date2) {
        if(date2[0] > date1[0]) {
            return 1;
        } else if(date2[0] < date1[0]) {
            return 0;
        } else {
            if(date2[1] > date1[1]) {
                return 1;
            } else if(date2[1] < date1[1]) {
                return 0;
            } else {
                if(date2[2] > date1[2]) {
                    return 1;
                } else {
                    return 0;
                } 
            }
        }
    }
}