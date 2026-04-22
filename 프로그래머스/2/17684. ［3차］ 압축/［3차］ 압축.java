import java.util.*;
class Solution {
    public int[] solution(String msg) {
        Map<String, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<26; i++) {
            map.put(String.valueOf((char)('A' + i)), i+1);
        }
        int j;
        for(int i=0; i<msg.length(); i++) {
            String tmp = msg.charAt(i) + "";
            j = i+1;
            while(true) {
                if(!map.containsKey(tmp)) {
                    map.put(tmp, map.size() + 1);
                    list.add(map.get(tmp.substring(0, tmp.length()-1)));
                    i += (j - i - 2);
                    break;
                } else if(j == msg.length()) {
                    list.add(map.get(tmp));
                    i += (j - i - 1);
                    break;
                }
                if(j > msg.length()) {
                    break;
                }
                tmp += msg.charAt(j);
                j++;
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    } 
}