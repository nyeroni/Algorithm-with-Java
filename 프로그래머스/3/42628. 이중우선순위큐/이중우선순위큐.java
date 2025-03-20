import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> minQueue = new PriorityQueue<>();
        PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<operations.length; i++) {
            if(operations[i].startsWith("I")) {
                int num = Integer.parseInt(operations[i].split(" ")[1]);
                minQueue.offer(num);
                maxQueue.offer(num);
            } else {
                if(operations[i].equals("D 1") && !maxQueue.isEmpty()) {
                    int max = maxQueue.poll();
                    minQueue.remove(max);
            }
                else if(operations[i].equals("D -1") && !minQueue.isEmpty()) {
                    int min = minQueue.poll();
                    maxQueue.remove(min);
                }
            }
        }
          
        if(minQueue.size() == 0) {
            return new int[]{0, 0};
        } else if(minQueue.size() == 1) {
            int num = minQueue.poll();
            return new int[]{num, num};
        } else {
            int max = maxQueue.poll();
            int min = minQueue.poll();
            return new int[]{max, min};
        }
    }
}