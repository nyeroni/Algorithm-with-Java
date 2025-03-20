import java.util.*;

class Solution {
    HashSet<Integer> set = new HashSet<>();
    boolean []visited = new boolean[7];
    public int solution(String numbers) {
        int cnt=0;
        dfs(numbers, "", 0);
        
        for(Integer i : set) {
            if(isPrime(i)) cnt++;
        }
        return cnt;
    }
    public void dfs(String numbers, String s, int depth){
        if(numbers.length() < depth) return;
        for(int i=0; i<numbers.length(); i++) {
            if(!visited[i]) {
                visited[i] = true;
                set.add(Integer.parseInt(s + numbers.charAt(i)));
                dfs(numbers, s + numbers.charAt(i), depth + 1);
                visited[i] = false;
            }
        }
    }
    private boolean isPrime(int n) {
        if(n==0) return false;
        if(n==1) {
            return false;
        } 
        if(n==2)return true;
        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }
}