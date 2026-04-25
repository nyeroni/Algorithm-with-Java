import java.util.*;
class Solution {
    static Map<Character, Integer> map = new HashMap<>();
    public String solution(String[] survey, int[] choices) {
        // R/T C/F J/M A/N
        // 1~7
        for(int i=0; i<choices.length; i++) {
            check(survey[i], choices[i]);
        }
        StringBuilder sb = new StringBuilder();
        if(map.getOrDefault('R', 0) >= map.getOrDefault('T', 0)) {
            sb.append("R");
        } else {
            sb.append("T");
        }
        if(map.getOrDefault('C', 0) >= map.getOrDefault('F', 0)) {
            sb.append("C");
        } else {
            sb.append("F");
        }
        if(map.getOrDefault('J', 0) >= map.getOrDefault('M', 0)) {
            sb.append("J");
        } else {
            sb.append("M");
        }
        if(map.getOrDefault('A', 0) >= map.getOrDefault('N', 0)) {
            sb.append("A");
        } else {
            sb.append("N");
        }
        return sb.toString();
    }
    public void check(String s, int num) {
        int first = 0, second = 0;
        switch(num){
            case 1:
                first = 3;
                break;
            case 2: 
                first = 2;
                break;
            case 3:
                first = 1;
                break;
            case 5:
                second = 1;
                break;
            case 6:
                second = 2;
                break;
            case 7:
                second = 3;
                break;
            default:
                break;
        }
        map.put(s.charAt(0), map.getOrDefault(s.charAt(0), 0) + first);
        map.put(s.charAt(1), map.getOrDefault(s.charAt(1), 0) + second);
    }
}