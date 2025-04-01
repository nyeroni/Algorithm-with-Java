import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        LinkedList<String> LRU = new LinkedList<>();
        if(cacheSize == 0) {
            return cities.length * 5;
        }
        for(String c : cities) {
            String upper = c.toUpperCase();
            if(LRU.isEmpty()) {
                answer += 5;
                LRU.add(upper);
            }
            else {
                if(LRU.contains(upper)) {
                    answer += 1;
                    LRU.remove(upper);
                    LRU.add(upper);
                } else {
                    answer += 5; 
                    if(LRU.size() < cacheSize) {
                        LRU.add(upper);
                    } else {
                        LRU.poll();
                        LRU.add(upper);
                    }
                }
            }
        }
        return answer;
    }
}