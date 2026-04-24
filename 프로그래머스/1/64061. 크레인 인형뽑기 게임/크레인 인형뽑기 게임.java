import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int j = 0;
        int count = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<moves.length; i++) {
            j=0;
            while(true) {
                if(j < board[0].length-1 && board[j][moves[i]-1] == 0) {
                    j++;
                } 
                else if(j <  board[0].length && board[j][moves[i]-1] != 0) {
                    if(!stack.isEmpty() && stack.peek() == board[j][moves[i]-1]) {
                        stack.pop();
                        count += 2;
                    }
                    else stack.push(board[j][moves[i]-1]);
                    board[j][moves[i]-1] = 0;
                    break;
                } else break;
            }
        }
        return count;
    }
}