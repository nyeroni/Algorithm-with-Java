import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int currentWeight = 0;
        int i=0;
        Deque <Integer> deque = new LinkedList<>();
        while(i < truck_weights.length) {
            answer ++;
            if(deque.size() == bridge_length) {
                currentWeight -= deque.pollFirst();
            }
            if(currentWeight + truck_weights[i] <= weight) {
                deque.offerLast(truck_weights[i]);
                currentWeight += truck_weights[i];
                i++;
            } else {
                deque.offer(0);
            }
        }
        
        return answer + bridge_length;
    }
}