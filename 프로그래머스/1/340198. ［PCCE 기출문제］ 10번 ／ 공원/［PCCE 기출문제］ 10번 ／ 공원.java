import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        Arrays.sort(mats);
        for(int i=mats.length-1; i>=0; i--) {
            if(check(park, mats[i])) return mats[i];
        }
        return -1;
    }
    public boolean check(String[][]park, int cnt) {
        int count = 0;
        for(int i=0; i<park.length; i++) {
            for(int j=0; j<park[i].length; j++) {
                if(park[i][j].equals("-1")) {
                    count = 0;
                    for(int k=i; k<i + cnt; k++) {
                        for(int l=j; l< j + cnt; l++) {
                            if(k < 0 || l < 0 || k >= park.length || l >= park[0].length) break;
                            if(!park[k][l].equals("-1")) break;
                            count ++;
                        }
                    }
                    if(count == cnt * cnt) return true;
                }
            }
        }
        return false;
    }
}