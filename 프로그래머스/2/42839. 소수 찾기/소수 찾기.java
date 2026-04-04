import java.util.*;

class Solution {
    Set<Integer> set = new HashSet<>();
    boolean[] visited;
    public int solution(String numbers) {
        visited = new boolean[numbers.length()];
        dfs("", numbers);
        
        int cnt = 0;
        for(int num : set) {
            if(isPrime(num)) cnt ++;
        }
        return cnt;
    }
    private void dfs(String current, String numbers) {
        if(!current.equals("")) {
            set.add(Integer.parseInt(current));
        }
        for(int i=0; i<numbers.length(); i++) {
            if(!visited[i]) {
                visited[i] = true;
                dfs(current + numbers.charAt(i), numbers);
                visited[i] = false;
            }
        }
    }
    private boolean isPrime(long num) {
        if(num < 2) return false;
        if(num == 2 || num == 3) return true;
        for(int i=2; i<=Math.sqrt(num); i++)  {
            if(num % i == 0) return false;
        }
        return true;
    }
}