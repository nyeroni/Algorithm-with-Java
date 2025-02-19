import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer;
        List<Integer> tmp = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++) {
            tmp.add(arr[i]);
        }
        
        for(int i=0; i<delete_list.length; i++) {
            if(tmp.contains(delete_list[i])) {
                tmp.remove(tmp.indexOf(delete_list[i]));
            }
        }
        answer = tmp.stream().mapToInt(i->i).toArray();
        return answer;
    }
}