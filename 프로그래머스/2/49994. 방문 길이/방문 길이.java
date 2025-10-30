import java.util.*;

class Solution {
    public int solution(String dirs) {
        int target = dirs.length();
        int x = 0;
        int y = 0;
        Set<String> set = new HashSet<>();
        for(char c : dirs.toCharArray()) {
            int nx = x;
            int ny = y;
            if(c=='U') ny++;
            else if(c=='D') ny--;
            else if(c=='L') nx--;
            else if(c=='R') nx++;
            if(ny > 5 || nx > 5 || nx < -5 || ny < -5) continue;
            
            String path1 = x+","+y+","+nx+","+ny;
            String path2 = nx+","+ny+","+x+","+y;
            
            set.add(path1);
            set.add(path2);
            
            x = nx;
            y = ny;
        }
        return set.size()/2;
    }
}