class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int i=0, j=0;
        String answer = "";
        for(int k=0; k<goal.length; k++) {
            if(i < cards1.length && goal[k].equals(cards1[i])) {
                i++;
            } else if(j < cards2.length && goal[k].equals(cards2[j])) {
                j++;
            }
            else {
                return "No";
            }
        }
        return "Yes";
    }
}