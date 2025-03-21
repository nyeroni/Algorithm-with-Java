import java.util.*;
class Solution {
    public int solution(int[] order) {
        int cnt = 0;
        //1 2 3 4 5
        //4 3 1 2 5
        //1 2 3
        //2 1
        //3 4 
        Stack<Integer> sub = new Stack<>();
        
        int i=1, j=0;
        while(true) {
            if(i==order.length+1) {
                break;
            }
            if(!sub.isEmpty()) {
                if(sub.peek()>order[j]) break;
                if(j==order.length) break;
                if(sub.peek()==order[j]) {
                    sub.pop();
                    cnt++;
                    j++;
                    continue;
                } else {
                    if(i==order.length) {
                        if(i==order[j]) {
                            cnt++;
                            j++;
                        }
                    }
                    else {
                        sub.push(i);
                        i++;
                    }
                }
            } else {
                sub.push(i);
                i++;
            }            
        }
        return cnt;
    }
}