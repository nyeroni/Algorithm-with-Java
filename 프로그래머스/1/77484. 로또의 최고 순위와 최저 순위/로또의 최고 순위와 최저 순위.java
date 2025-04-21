import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int win = 0;
        int countZero = 0;
        List<Integer> wins = new ArrayList<>();
        for(int i : win_nums) {
            wins.add(i);
        }
        for(int i=0; i<lottos.length; i++) {
            System.out.println("lottos[i] : " + lottos[i]);
            if(wins.contains(lottos[i])) {
                win ++;
            }
            if(lottos[i] == 0) {
                countZero ++;
            }
        }
        System.out.println("count :" + countZero);
        System.out.println("win : " + win);
        answer[0] = prize(win+countZero);
        answer[1] = prize(win);
        return answer;
    }
    public int prize(int n) {
        if(n == 6) {
            return 1;
        } else if(n==5) {
            return 2;
        }  else if(n==4) {
            return 3;
        }  else if(n==3) {
            return 4;
        }  else if(n==2) {
            return 5;
        } else {
            return 6;
        }
        
    }
}