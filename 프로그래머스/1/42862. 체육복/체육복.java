import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=1; i<=n; i++) {
            map.put(i, 1);
        }
        for(int l : lost) {
            map.put(l, map.get(l) - 1);
        }
        for(int r : reserve) {
            map.put(r, map.get(r) + 1);
        }
     
        for(int i=1; i<=n; i++) {
            // System.out.println("i : " + i + ", map.get(i) : " + map.get(i));
            if(map.get(i) < 1) {
                if(i - 1 > 0 && map.get(i-1) > 1) {
                    // System.out.println("b : " + (i-1));
                    map.put(i, map.get(i) + 1);
                    map.put(i-1, map.get(i-1)-1);
                }
                else if(i < n && map.get(i+1) > 1) {
                    // System.out.println("a : " + (i+1));
                    map.put(i, map.get(i) + 1);
                    map.put(i+1, map.get(i+1)-1);
                } 
            }
        }
        int cnt = 0;
        for(int i=1; i<=n; i++) {
            if(map.get(i) >= 1) cnt ++;
        }
        return cnt;
    }
}