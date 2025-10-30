import java.util.*;

class Solution {
    public int[] solution(String s) {
        
        s = s.substring(2, s.length()-2);
        String[] str = s.split("\\},\\{");
        Arrays.sort(str, new Comparator<String>() {
            public int compare(String a, String b) {
                return a.length()-b.length();
            }
        });
        List<Integer> list = new ArrayList<>();
        for(String st : str) {
            String[] tmp = st.split(",");
            for(String t : tmp) {
                int num = Integer.parseInt(t);
                if(list.contains(num)) continue;
                list.add(num);
            }
        }
        
        return list.stream().mapToInt(i->i).toArray();
    }
}