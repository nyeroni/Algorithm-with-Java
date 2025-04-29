import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        int[] answer;
        List<Integer> tmp = new ArrayList<>();
        
        for(int i=0; i<my_string.length(); i++) {
            if(my_string.charAt(i) >= '0' && my_string.charAt(i) <= '9') {
                tmp.add(Integer.parseInt(String.valueOf(my_string.charAt(i))));
            }
        }
        answer = tmp.stream().mapToInt(i->i).toArray();
        Arrays.sort(answer);
        return answer;
    }
}