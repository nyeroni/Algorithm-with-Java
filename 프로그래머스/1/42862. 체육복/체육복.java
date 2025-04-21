import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        Arrays.sort(lost);
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> lostTmp = new ArrayList<>();
        List<Integer> reserveTmp = new ArrayList<>();
        for(int i=0; i<lost.length; i++) {
            lostTmp.add(lost[i]);
        }
        for(int i=0; i<reserve.length; i++) {
            reserveTmp.add(reserve[i]);
        }
        for(int i=1; i<=n; i++) {
            if(reserveTmp.contains(i)) {
                map.put(i, map.getOrDefault(i, 0) + 1);
            } 
            if(lostTmp.contains(i)) {
                map.put(i, map.getOrDefault(i, 0) - 1);
            }
            map.put(i, map.getOrDefault(i, 0));
        }

        for(int i=0; i<lost.length; i++) {
            if(map.get(lost[i]) == 0) {
                continue;
            }
            int l1 = lost[i] - 1;
            int l2 = lost[i] + 1;
            if(l1 > 0 && map.get(l1) == 1) {
                map.put(l1, map.get(l1) - 1);
                map.put(lost[i], map.get(lost[i]) + 1);
                continue;
            }
            else if(l2 <= n && map.get(l2) == 1) {
                map.put(l2, map.get(l2) - 1);
                map.put(lost[i], map.get(lost[i]) + 1);
            }

        }
    
        for(int i : map.keySet()) {
            // System.out.println("i  : " + i + " map.get(i) : " + map.get(i));
            if(map.get(i) >= 0) {
                answer ++;
            }
        }
        return answer;
    }
}