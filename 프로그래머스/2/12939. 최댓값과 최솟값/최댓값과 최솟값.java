import java.util.*;

class Solution {
    public String solution(String s) {
        String[] str = s.split(" ");
        List<Integer> list = new ArrayList<>();
        for(String st : str) {
            list.add(Integer.parseInt(st));
        }
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        sb.append(list.get(0));
        sb.append(" ");
        sb.append(list.get(list.size()-1));
        return sb.toString();
    }
}