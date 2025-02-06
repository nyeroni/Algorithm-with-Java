import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        int[] answer;
        List<Integer> tmp = new ArrayList<>();
        for(int i=l; i<=r; i++) {
            int count = 0;
            String s = String.valueOf(i);
            String[] str = s.split("");
            for(int j=0; j<str.length; j++) {
                if(str[j].equals("0") || str[j].equals("5")) {
                    count ++;
                }
            }
            if(str.length == count) {
                tmp.add(Integer.parseInt(s));
            }
        }
        if(tmp.size() == 0) {
            answer = new int[1];
            answer[0] = -1;

        } else {
            int i=0;
            answer = new int[tmp.size()];
            for(int t : tmp) {
                answer[i] = t;
                i++;
            }
        }
        return answer;
    }
}