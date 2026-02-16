import java.util.*;

class Solution {
    public long solution(long n) {
        String s = String.valueOf(n);
        Integer [] arr = new Integer[s.length()];
        int i=0;
        for(Character c : s.toCharArray()) {
            arr[i] = Integer.parseInt(String.valueOf(c));
            i++;
        }
        Arrays.sort(arr, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(int num : arr) {
            sb.append(String.valueOf(num));
        }
        return Long.parseLong(sb.toString());
    }
}