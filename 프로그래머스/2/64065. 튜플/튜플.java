import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer;
        s = s.substring(2, s.length()-2);
        String[] str = s.split("\\},\\{");
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.length() - b.length();
            }
            
        });
        List<Integer> tuple = new ArrayList<>();
        for(String ss : str) {
            String[] tmp = ss.split(",");
            for(String t : tmp) {
                int num = Integer.parseInt(t);
                if(tuple.contains(num)) continue;
                tuple.add(num);
            }
        }
        answer = tuple.stream().mapToInt(i->i).toArray();
        return answer;
    }
}