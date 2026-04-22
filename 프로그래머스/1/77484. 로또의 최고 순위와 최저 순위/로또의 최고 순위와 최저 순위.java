import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        List<Integer> win = new ArrayList<>();
        for(int num : win_nums) {
            win.add(num);
        }
        int count = 0;
        int zeroCount = 0;
        for(int i=0; i<lottos.length; i++) {
            if(lottos[i] != 0 && win.contains(lottos[i])) {
                count ++;
            } else if(lottos[i] == 0) zeroCount ++;
        }
        return new int[]{calculate(count + zeroCount), calculate(count)};
    }
    public int calculate(int num ) {
        if(num == 6) return 1;
        else if(num == 5) return 2;
        else if(num == 4) return 3;
        else if(num == 3) return 4;
        else if(num == 2) return 5;
        return 6;
    }
}