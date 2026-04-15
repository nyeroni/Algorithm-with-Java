import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Queue<Integer> queue = new LinkedList<>();
        int[] answer = new int[priorities.length];
        for(int i=0; i<priorities.length; i++) {
            pq.offer(priorities[i]);
            queue.offer(i);
        }
        int k=0;
        while(!pq.isEmpty()) {
            int n = queue.poll();
            System.out.println("n : " + n + ", pq.peek() : " + pq.peek());
            if(pq.peek() > priorities[n]) {
                System.out.println("hi");
                queue.offer(n);
            } else {
                pq.poll();
                answer[k++] = n;
            }
        }
        int result = 0;
        for(int i=0; i<answer.length; i++) {
            System.out.println("answer[i] : " + answer[i]);
            if(answer[i] == location) result = i + 1;
        }
        return result;
    }
}