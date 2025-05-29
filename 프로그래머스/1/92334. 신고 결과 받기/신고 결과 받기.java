import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, List<String>> map = new HashMap<>();
        Map<String, Integer> count = new HashMap<>();
        for(int i=0; i<id_list.length; i++) {
            map.put(id_list[i], new ArrayList<>());
        }
        for(int i=0; i<report.length; i++) {
            String[] tmp = report[i].split(" ");
            List<String> t = map.get(tmp[0]);
            if(t.contains(tmp[1])) {
                continue;
            }
            t.add(tmp[1]);
            count.put(tmp[1], count.getOrDefault(tmp[1], 0) + 1);
        }
        for(int i = 0; i<id_list.length; i++) {
            List<String> t = map.get(id_list[i]);
            int cnt = 0;
            for(String str : t) {
                if(count.getOrDefault(str, 0) >= k) {
                    cnt ++;
                }
            }
            answer[i] = cnt;
        }
        return answer;
    }
}