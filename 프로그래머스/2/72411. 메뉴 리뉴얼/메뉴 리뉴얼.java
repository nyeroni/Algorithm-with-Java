import java.util.*;
class Solution {
    static Map<String, Integer> map;
    public String[] solution(String[] orders, int[] course) {
        List<String> answer = new ArrayList<>();
        
        for(int size : course) {
            map = new HashMap<>();
            for(String order : orders) {
                char[] arr = order.toCharArray();
                Arrays.sort(arr);
                comb(arr, size, 0, new StringBuilder());
            }
            int max = 0;
            for(int count : map.values()) {
                if(max < count) max = count;
            }
            if(max < 2) continue;
            for(String key : map.keySet()) {
                if(max == map.get(key)) {
                    answer.add(key);
                }
            }
        }
        Collections.sort(answer);
        return answer.toArray(new String[0]);
    }
    public void comb(char[] arr, int size, int start, StringBuilder sb) {
        if(sb.length() == size) {
            String menu = sb.toString();
            map.put(menu, map.getOrDefault(menu, 0) + 1);
            return;
        }
        for(int i=start; i<arr.length; i++) {
            sb.append(arr[i]);
            comb(arr, size, i+1, sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}