import java.util.*;
class Solution {
    Map<String, Integer> map = new HashMap<>();
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        
        for(int i=0; i<survey.length; i++) {
            calculate(survey[i], choices[i]);
        }

        if(map.getOrDefault("R", 0) < map.getOrDefault("T", 0)) {
            answer += "T";
        } else {
            answer += "R";
        }
        if(map.getOrDefault("C", 0) < map.getOrDefault("F", 0)) {
            answer += "F";
        } else answer += "C";
        if(map.getOrDefault("J", 0) < map.getOrDefault("M", 0)) {
            answer += "M";
        } else answer += "J";
        if(map.getOrDefault("A", 0) < map.getOrDefault("N", 0)) {
            answer += "N";
        } else answer += "A";
        
        return answer;
    }
    public void calculate(String s, int n) {
        String a = String.valueOf(s.charAt(0));
        String b = String.valueOf(s.charAt(1));
        if(n == 1) {
            map.put(a, map.getOrDefault(a, 0) + 3);
        } else if(n == 2) {
            map.put(a, map.getOrDefault(a, 0) + 2);
        } else if(n == 3) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        } else if(n == 5) {
            map.put(b, map.getOrDefault(b, 0) + 1);
        } else if(n == 6) {
            map.put(b, map.getOrDefault(b, 0) + 2);
        } else if(n == 7) {
            map.put(b, map.getOrDefault(b, 0) + 3);
        }
    }
}