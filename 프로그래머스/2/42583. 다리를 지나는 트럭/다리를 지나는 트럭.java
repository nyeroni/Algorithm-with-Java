import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> queue = new LinkedList<>();
        int time = 0;
        int idx = 0;
        int sum = 0;
        for(int i=0; i<bridge_length; i++) {
            queue.offer(0);
        }
        while(idx < truck_weights.length) {
            time ++;
            sum -= queue.poll();
            if(sum + truck_weights[idx] <= weight) {
                sum += truck_weights[idx];
                queue.offer(truck_weights[idx]);
                idx ++;
            } else queue.offer(0);
        }
        return time + bridge_length;
    }
}