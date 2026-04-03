import java.util.*;
import java.util.stream.*;
class Solution {
    static Map<String, List<String>> map;
    static List<String> answer;
    public String[] solution(String[][] tickets) {
        map = new HashMap<>();
        answer = new ArrayList<>();
        for(int i=0; i<tickets.length; i++) {
            if(!map.containsKey(tickets[i][0])) {
                map.put(tickets[i][0], new ArrayList<String>());
            } 
            map.get(tickets[i][0]).add(tickets[i][1]);
        }
        
        for(String key : map.keySet()) {
            Collections.sort(map.get(key), Collections.reverseOrder());
        }
        dfs("ICN");
        
        Collections.reverse(answer);
        return answer.toArray(new String[0]);
    }
    public void dfs(String cur) {

        if(map.containsKey(cur)) {
            List<String> list = map.get(cur);
            while(!list.isEmpty()) {
                String tmp = list.remove(list.size()-1);
                dfs(tmp);
            }
        }
        answer.add(cur);
    }
}