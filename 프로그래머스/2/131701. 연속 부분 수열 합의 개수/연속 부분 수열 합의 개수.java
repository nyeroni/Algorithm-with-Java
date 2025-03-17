import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;

        Set<Integer> set = new HashSet<>();
        int len=1;
        while(true) {
            //01 12 23 34 40
            //012 123 234 340 401
            int sum = 0;
            for(int i=0; i<elements.length; i++) {
                sum = 0;
                if(len==1) {
                    set.add(elements[i]);
                }
                for(int j=i; j<len+i; j++){
                    int k = j;
                    if(j >= elements.length) {
                        k=j % elements.length;
                    }
                    sum += elements[k];
                }
                set.add(sum);
            }
            if(len == elements.length) {
                break;
            }
            len ++;
        }
        answer = set.size();
        return answer;
    }
}