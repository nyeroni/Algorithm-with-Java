import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        List<Integer> tmp = new ArrayList<>();
        double cnt = 0;
        for(int i = 0; i < arr.length; i++) {
            tmp.add(arr[i]);
        }
        while(true) {
            int length = tmp.size();
            if((int)Math.pow(2, cnt) == length) {
                break;
            } else if((int)Math.pow(2, cnt) < length && (int)Math.pow(2, cnt+1) > length) {
                tmp.add(0);
            } else if((int)Math.pow(2, cnt) < length) {
                cnt++;
            }
        }
        answer = tmp.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}