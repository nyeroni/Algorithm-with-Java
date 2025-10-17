import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<players.length; i++) {
            map.put(players[i], i);
        }

        for(String c : callings) {
            int idx = map.get(c);
            if(idx == 0) continue;
            String prev = players[idx-1];
            players[idx-1] = c;
            players[idx] = prev;
            
            map.put(c, idx -1);
            map.put(prev, idx);
        }
        return players;
    }
}