import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        if(cacheSize == 0) return cities.length * 5;
        Queue<String> queue = new LinkedList<>();
        int answer = 0;
        for(int i=0; i<cities.length; i++) {
            cities[i] = cities[i].toLowerCase();
            if(queue.size() < cacheSize) {
                if(!queue.isEmpty() && queue.contains(cities[i])) {
                    answer += 1;
                    queue.remove(cities[i]);
                } else {
                    answer += 5;
                } 
                queue.add(cities[i]);
            } else {
                if(queue.contains(cities[i])) {
                    answer += 1;
                    queue.remove(cities[i]);
                } else {
                    answer += 5;
                    queue.remove();
                }
                queue.add(cities[i]);
            }
        }
        return answer;
    }
}