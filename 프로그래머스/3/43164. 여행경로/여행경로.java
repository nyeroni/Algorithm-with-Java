import java.util.*;
import java.util.stream.*;
class Solution {
    Map<String, PriorityQueue<String>> answer = new HashMap<>();
    public String[] solution(String[][] tickets) {
        
        for(int i=0; i<tickets.length; i++) {
            if(!answer.containsKey(tickets[i][0])) {
                answer.put(tickets[i][0], new PriorityQueue<>());
            }
            answer.get(tickets[i][0]).offer(tickets[i][1]);
        }
        return dfs(new ArrayList<>(), "ICN").toArray(new String[0]);
        
    }
    public List<String> dfs (List<String> list, String world) {
        if(!answer.containsKey(world) || answer.get(world).size() == 0) {
            list.add(world);
            return list;
        }
        list.add(world);
        List<String> a = dfs(new ArrayList<>(), answer.get(world).poll());
        if(!answer.get(world).isEmpty()) {
            List<String> b = dfs(new ArrayList<>(), answer.get(world).poll());
            list.addAll(b);
        } 
        list.addAll(a);
        return list;
        
    }
}