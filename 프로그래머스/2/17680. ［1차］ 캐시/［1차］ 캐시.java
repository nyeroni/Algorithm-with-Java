import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Queue<String> queue = new LinkedList<>();
        if(cacheSize == 0) {
            return cities.length * 5;
        }
        for(int i=0; i<cities.length; i++) {
            cities[i] = cities[i].toLowerCase();
        
            if(queue.size() <= cacheSize ) {
                if(queue.contains(cities[i])) {
                    queue.remove(cities[i]);
                    queue.offer(cities[i]);
                    answer += 1;
                } else {
                    answer += 5;
                    if(queue.size() == cacheSize) {
                        queue.poll();
                        queue.offer(cities[i]);
                    } else if(queue.size() < cacheSize) {
                        queue.offer(cities[i]);
                    }
                }
            }

        }
        return answer;
    }
}