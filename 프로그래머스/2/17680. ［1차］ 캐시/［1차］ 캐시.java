import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        Queue<String> queue = new LinkedList<>();
        int answer = 0;
        if(cacheSize == 0) return 5 * cities.length;
        for(int i=0; i<cities.length; i++) {
            cities[i] = cities[i].toLowerCase();
            if(queue.size() < cacheSize) {
                if(!queue.isEmpty() && queue.contains(cities[i])) {
                    answer += 1;
                    queue.remove(cities[i]);
                } else {
                    answer += 5;
                }
                queue.offer(cities[i]);
            } else {
                if(queue.contains(cities[i])) {
                    answer += 1;
                    queue.remove(cities[i]);
                } else {
                    queue.poll();
                    answer += 5;
                }
                queue.offer(cities[i]);
            }
        }
        return answer;
    }
}