import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Map<Integer, Stack<Integer>> map = new HashMap<>(); 
           
        for (int j = 0; j < board[0].length; j++) {
            map.put(j + 1, new Stack<>());
        }
        for(int i=board.length-1; i>=0; i--) {
            for(int j=0; j<board[i].length; j++) {
                if (board[i][j] != 0) {
                    map.get(j + 1).push(board[i][j]);
                }
            }
        }
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<moves.length; i++) {
            if(!map.get(moves[i]).isEmpty()) {
               int m = map.get(moves[i]).pop();
                if(!stack.isEmpty()) {
                    int n = stack.peek();
                    if(n==m) {
                        stack.pop();
                        answer += 2;
                        continue;
                    }
                }
                stack.push(m);
            }
        }
        return answer;
    }
}