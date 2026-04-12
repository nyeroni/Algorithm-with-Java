import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int min = Integer.MAX_VALUE;
        for(int a : arr) {
            if(min > a) min = a;
        }
        List<Integer> list = new ArrayList<>();
        for(int a : arr) {
            if(min != a) list.add(a);
        }
        if(list.size() == 0) return new int[]{-1};
        return list.stream().mapToInt(i->i).toArray();
    }
}