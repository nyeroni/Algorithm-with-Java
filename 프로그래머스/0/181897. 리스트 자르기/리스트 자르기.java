import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer;
        List<Integer> tmp = new ArrayList<>();
        
        if(n == 1) {
            for(int i=0; i<=slicer[1]; i++) {
                tmp.add(num_list[i]);
            }
        } else if(n==2) {
            for(int i=slicer[0]; i<num_list.length; i++) {
                tmp.add(num_list[i]);
            }
        } else if(n==3) {
            for(int i=slicer[0]; i<=slicer[1]; i++) {
                tmp.add(num_list[i]);
            }
        } else if(n==4) {
            for(int i=slicer[0]; i<=slicer[1]; i+=slicer[2]) {
                tmp.add(num_list[i]);
            }
        }
        answer = tmp.stream().mapToInt(i->i).toArray();
        return answer;
    }
}