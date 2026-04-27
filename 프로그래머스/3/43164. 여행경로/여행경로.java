import java.util.*;
import java.util.stream.*;
class Solution {
    static List<String> answer = new ArrayList<>();
    static boolean[] visited;
    public String[] solution(String[][] tickets) {
        visited = new boolean[tickets.length];
        Arrays.sort(tickets, (a, b) -> {
           if(a[0].equals(b[0])) {
               return a[1].compareTo(b[1]);
           }
            return a[0].compareTo(b[0]);
        });
        List<String> route = new ArrayList<>();
        route.add("ICN");
        dfs("ICN", tickets, route, 0);
        return answer.toArray(new String[0]);
    }
    public boolean dfs(String now, String[][] tickets, List<String> route, int depth) {
        if(depth == tickets.length) {
            answer = new ArrayList<>(route);
            return true;
        }
        for(int i=0; i<tickets.length; i++) {
            if(!visited[i] && tickets[i][0].equals(now)) {
                visited[i] = true;
                route.add(tickets[i][1]);
                if(dfs(tickets[i][1], tickets, route, depth + 1)) {
                    return true;
                }
                route.remove(route.size()-1);
                visited[i] = false;
            }
        }
        return false;
        
    }
}