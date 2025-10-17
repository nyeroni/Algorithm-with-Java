class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int x = 0;
        int y = 0;
        for(int i=0; i<park.length; i++) {
            for(int j=0; j<park[i].length(); j++) {
                if(park[i].charAt(j) == 'S') {
                    x = i;
                    y = j;
                }
            }
        }

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        String dir = "SNWE";
        
        for(String route : routes) {
            String []tmp = route.split(" ");
            char direction = tmp[0].charAt(0);
            int move = Integer.parseInt(tmp[1]);
            
            int nx = x;
            int ny = y;
            boolean valid = true;
            
            int idx = dir.indexOf(direction);
            for(int j=0; j<move; j++) {
                nx += dx[idx];
                ny += dy[idx];
                
                if(nx < 0 || ny < 0 || nx >= park.length || ny >= park[0].length()) {
                    valid = false;
                    break;
                }
                if(park[nx].charAt(ny) == 'X') {
                    valid = false;
                    break;
                }
            }
            if(valid) {
                x = nx;
                y = ny;
            } 
        }
        answer[0] = x;
        answer[1] = y;
        return answer;
    }
}