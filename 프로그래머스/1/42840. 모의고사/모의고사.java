import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int x = 0, y = 0, z = 0;
        for(int i=0; i<answers.length; i++) {
           if(a[i%a.length] == answers[i]) {
               x++;
           }
            if(b[i%b.length] == answers[i]) {
               y++;
           }
            if(c[i%c.length] == answers[i]) {
               z++;
           }
        }
        List<Integer> list = new ArrayList<>();
        int max = Math.max(Math.max(x, y), z);
        if(max == x) list.add(1);
        if(max == y) list.add(2);
        if(max == z) list.add(3);
        return list.stream().mapToInt(i->i).toArray();
    }
}