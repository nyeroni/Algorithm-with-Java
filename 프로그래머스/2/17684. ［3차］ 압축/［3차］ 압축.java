import java.util.*;
class Solution {
    static List<Integer> ans = new ArrayList<>();
    static List<String> list = new ArrayList<>();
    public int[] solution(String msg) {
        int[] answer;
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        for(int i=0; i<alpha.length(); i++) {
            list.add(String.valueOf(alpha.charAt(i)));
        }
        
        int i=0,j=1;
        String tmp = "";
        while(i<msg.length()) {
            tmp = msg.substring(i, j);
            if(!checkList(tmp)) {
                list.add(tmp);
                ans.add(list.indexOf(msg.substring(i, j-1)) + 1);
                i = j-1;
                j=i+1;
            }
            else {
                j++;
            }
            if(j>msg.length()) {
                break;
            }
        }
        ans.add(list.indexOf(tmp) + 1);
        answer = ans.stream().mapToInt(k->k).toArray();
        return answer;
    }
    private boolean checkList(String str) {
        if(list.contains(str)) {
            return true;
        }
        return false;
    } 
}