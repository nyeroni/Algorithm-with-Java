import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        List<Integer> tmp = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 2) {
                tmp.add(i);
            }
        }
        if(tmp.size() == 0) {
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        List<Integer> array = new ArrayList<>();
        for(int i=tmp.get(0); i<=tmp.get(tmp.size()-1); i++) {
            array.add(arr[i]);
        }
        answer = array.stream().mapToInt(i->i).toArray();
        return answer;
    }
}