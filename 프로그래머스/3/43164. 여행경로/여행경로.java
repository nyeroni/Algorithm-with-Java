import java.util.*;

class Solution {
    static boolean[] visited;
    static List<String> answer;
    public String[] solution(String[][] tickets) {
        visited = new boolean[tickets.length];
        answer = new ArrayList<>();
        
        Arrays.sort(tickets, (a, b) -> {
           if(a[0].equals(b[0])) return a[1].compareTo(b[1]);
            return a[0].compareTo(b[0]);
        });
        List<String> route = new ArrayList<>();
        route.add("ICN");
        dfs("ICN", tickets, route);
        return answer.toArray(new String[0]);
    }
    public boolean dfs(String current, String[][] tickets, List<String> route) {
        if(route.size() == tickets.length + 1) {
            answer = new ArrayList<>(route);
            return true;
        }
        for(int i=0; i<tickets.length; i++) {
            if(visited[i]) continue;
            if(!tickets[i][0].equals(current)) continue;
            visited[i] = true;
            route.add(tickets[i][1]);
            if(dfs(tickets[i][1], tickets, route)) {
                return true;
            }
            visited[i] = false;
            route.remove(route.size()-1);
        }
        return false;
    }
}