import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> q1 = new LinkedList<>();
        Queue<String> q2 = new LinkedList<>();
        for(String card : cards1) {
            q1.add(card);
        }
        for(String card : cards2) {
            q2.add(card);
        }
        for(String card : goal) {
            if(!q1.isEmpty() && q1.peek().equals(card)) {
                q1.remove();
            } else if(!q2.isEmpty() && q2.peek().equals(card)) {
                q2.remove();
            } else return "No";
        }
        return "Yes";
    }
}