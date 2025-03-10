import java.util.*;

class Solution {
    public int solution(String dirs) {
        int answer = 0;
        Set<String> set = new HashSet<String>(); 
                
        int x = 0;
        int y = 0;
        
        for(int i=0; i<dirs.length(); i++){
            int nx = x;
            int ny = y;
            String pos = ""; 
            String tmp = "";
            if(dirs.charAt(i) == 'U'){
                ny++;
                pos += x;
                pos += y;
                pos += nx;
                pos += ny;
                tmp += nx;
                tmp += ny;
                tmp += x;
                tmp += y;

            }
            else if(dirs.charAt(i) == 'D'){
                ny--;
                pos += x;
                pos += y;
                pos += nx;
                pos += ny;
                tmp += nx;
                tmp += ny;
                tmp += x;
                tmp += y;
            }
            else if(dirs.charAt(i) == 'R'){
                nx++;
                pos += x;
                pos += y;
                pos += nx;
                pos += ny;
                tmp += nx;
                tmp += ny;
                tmp += x;
                tmp += y;
            }
            else if(dirs.charAt(i) == 'L'){
                nx--;
                pos += x;
                pos += y;
                pos += nx;
                pos += ny;
                tmp += nx;
                tmp += ny;
                tmp += x;
                tmp += y;
            }
            if(nx < -5 || ny < -5 || nx > 5 || ny > 5) {
                continue;
            }       
       
            if(!set.contains(tmp) && !set.contains(pos)) {
                set.add(pos);
            }
            
            x = nx;
            y = ny;
        }
        answer = set.size();
        return answer;
    }
}