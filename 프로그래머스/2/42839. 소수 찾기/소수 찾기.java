import java.util.*;

class Solution {
    static Set<Integer> set = new HashSet<>();
    public int solution(String numbers) {
        String[] nums = numbers.split("");
        boolean[] visited = new boolean[nums.length];
        dfs("", nums, visited, 0);
        int count = 0;
        for(int i : set) {
            System.out.println("i : " + i);
            if(isPrime(i)) count ++;
        }
        return count;
    }
    public void dfs(String now, String[] nums, boolean[] visited, int depth) {
        if(!now.equals("") && now.charAt(0) != '0') set.add(Integer.parseInt(now));
        if(depth == nums.length) return;
        for(int i=0; i<nums.length; i++) {
            if(!visited[i]) {
                visited[i] = true;
                dfs(now + nums[i], nums, visited, depth + 1);
                visited[i] = false;
            }
        }
    }
    public boolean isPrime(int num) {
        if(num == 1) return false;
        else if(num == 2 || num == 3) return true;
        for(int i=2; i<=Math.sqrt(num); i++) {
            if(num % i == 0) return false;
        }
        return true;
    }
}