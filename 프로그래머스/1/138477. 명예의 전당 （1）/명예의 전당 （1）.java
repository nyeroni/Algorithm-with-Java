import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> win = new PriorityQueue<>();
        for(int i=0; i<score.length; i++) {
            if(win.size() < k) {
                win.add(score[i]);
            } else {
                if(win.peek() < score[i]) {
                    int n = win.poll();
                    win.add(score[i]);
                }
            }
            answer[i] = win.peek();
        }
        return answer;
    }
}