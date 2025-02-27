import java.util.*;

class Solution {
    public int[] solution(String myString) {
        int[] answer;
        List<Integer> arr = new ArrayList<>();
        String[] tmp = myString.split("x");
        
        for(int i=0; i<tmp.length; i++) {
            arr.add(tmp[i].length());
        }

        if(myString.charAt(myString.length()-1) == 'x' ) {
            arr.add(0);
        }
        
        answer = arr.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}