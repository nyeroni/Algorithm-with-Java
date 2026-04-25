import java.util.*;

class Solution {
    static Set<String> result = new HashSet<>();
    static boolean[] visited;
    static Map<String, Integer> bannedMap = new HashMap<>();
    public int solution(String[] user_id, String[] banned_id) {
        visited = new boolean[user_id.length];
        dfs(0, user_id, banned_id);
        return result.size();
    }
    public void dfs(int depth, String[] user_id, String[] banned_id) {
        if(depth == banned_id.length) {
            List<String> list = new ArrayList<>();
            for(int i=0; i<visited.length; i++) {
                if(visited[i]) {
                    list.add(user_id[i]);
                }
            }
            // Collections.sort(list);
            result.add(String.join(",", list));
            return;
        }
        for(int i=0; i<user_id.length; i++) {
            if(visited[i]) continue;
            if(isMatch(user_id[i], banned_id[depth])) {
                visited[i] = true;
                dfs(depth + 1, user_id, banned_id);
                visited[i] = false;
            }
        }
    }
    public boolean isMatch(String u, String b) {
        if(u.length() != b.length()) return false;
        for(int i=0; i<u.length(); i++) {
            if(b.charAt(i) == '*') continue;
            if(b.charAt(i) != u.charAt(i)) return false;
        }
        return true;
    }
}