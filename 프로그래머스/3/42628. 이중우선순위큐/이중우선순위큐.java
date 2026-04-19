import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> A = new PriorityQueue<>();
        PriorityQueue<Integer> B = new PriorityQueue<>(Collections.reverseOrder());
        for(String s : operations) {
            if(s.equals("D 1")) {
                A.remove(B.poll());
            } else if(s.equals("D -1")) {
                B.remove(A.poll());
            } else {
                s = s.substring(2);
                int num = Integer.parseInt(s);
                A.offer(num);
                B.offer(num);
            }
        }
        if(A.isEmpty()) 
            return new int[]{0, 0};
        return new int[]{B.poll(), A.poll()};
    }
}