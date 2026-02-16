import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] tmp = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
            tmp[i] = arr[i];
        }
        Arrays.sort(tmp);
        int min = tmp[0];
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            if(min != arr[i]) {
                list.add(arr[i]);
            }
        }
        if(list.size() == 0) return new int[]{-1}; 
        return list.stream().mapToInt(i->i).toArray();
    }
}