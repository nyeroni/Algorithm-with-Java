import java.util.*;

class Solution {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<elements.length; i++){
            int sum = elements[i];
            int j = i+1;
            while(i != j) {
                set.add(sum);
                if(j == elements.length) j = 0;
                sum += elements[j];
                if(j == i)break;
                j++;
            }
        }
        return set.size();
    }
}