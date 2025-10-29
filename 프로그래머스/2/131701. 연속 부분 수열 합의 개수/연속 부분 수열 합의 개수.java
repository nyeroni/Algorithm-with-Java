import java.util.*;

class Solution {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<elements.length; i++) {
            int sum = elements[i];
            int j = i+1;
            while(j != i) {
                set.add(sum);
                if(j==elements.length) {
                    j = 0;
                }
                if(j == i) break;
                sum += elements[j];
                // System.out.println("sum : " + sum);
                set.add(sum);
                j++;
            }
        }
        
        return set.size();
    }
}