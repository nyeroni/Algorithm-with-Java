import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        List<Integer> lostList = new ArrayList<>();
        List<Integer> reserveList = new ArrayList<>();
        
        for(int l : lost) {
            if(!contains(reserve, l)) {
                lostList.add(l);
            }
        }
        for(int r : reserve) {
            if(!contains(lost, r)) {
                reserveList.add(r);
            }
        }
        
        int attend = n - lostList.size();
        
        for(int l : lostList) {
            if(reserveList.contains(l-1)) {
                reserveList.remove(Integer.valueOf(l-1));
                attend ++;
            } else if(reserveList.contains(l+1)) {
                reserveList.remove(Integer.valueOf(l+1));
                attend ++;
            }
        }
        return attend;
    }
    private boolean contains(int[] arr, int value) {
        for(int i : arr) {
            if(i==value) return true;
        }
        return false;
    }
}