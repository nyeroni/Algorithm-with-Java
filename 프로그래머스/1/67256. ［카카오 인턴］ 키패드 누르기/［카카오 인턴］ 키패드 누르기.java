import java.util.*;
class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        
        int nowR = 10, nowL = 12;
        
        for(int num : numbers) {
            if(num == 0) num = 11;
            if(num == 1 || num == 4 || num == 7) {
                sb.append("L");
                nowL = num;
            } else if(num == 3 || num == 6 || num == 9) {
                sb.append("R");
                nowR = num;
            } else {
                int lenL = Math.abs(nowL - num);
                lenL = lenL/3 + lenL%3;
                int lenR = Math.abs(nowR - num);
                lenR = lenR/3 + lenR%3;
                if(lenL < lenR) {
                    sb.append("L");
                    nowL = num;
                } else if(lenL > lenR){
                    sb.append("R");
                    nowR = num;
                } else {
                    if(hand.equals("right")) {
                        sb.append("R");
                        nowR = num;
                    }
                    else if(hand.equals("left")) {
                        nowL = num;
                        sb.append("L");
                    }
                }
            }
        }
        return sb.toString();
    }
}