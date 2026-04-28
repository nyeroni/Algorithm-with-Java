class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int startX = -1, startY = -1;
        for(int i=0; i<park.length; i++) {
            for(int j=0; j<park[0].length(); j++) {
                if(park[i].charAt(j) == 'S') {
                    startX = i;
                    startY = j;
                    break;
                }
            }
            if(startX != -1 && startY != -1) break;
        }
        int nx = startX, ny = startY;
        for(String route : routes) {
            String[] tmp = route.split(" ");
            String op = tmp[0];
            int n = Integer.parseInt(tmp[1]);
            
            if(op.equals("E")) {
                ny = startY + n; 
                // System.out.println("ny : " + ny);
                for(int i=startY+1; i<=ny; i++) {
                    // System.out.println("i : " + i + ", park[nx].length() : " + park[nx].length());
                    if(i < 0 || i >= park[nx].length() || park[nx].charAt(i) == 'X') {
                        ny = startY;
                        break;
                    }
                }
                // System.out.println("ny : " + ny);
            
            } else if(op.equals("W")) {
                ny = startY - n; 
                for(int i=startY-1; i>=ny; i--) {
                    if(i < 0 || i >= park[nx].length() || park[nx].charAt(i) == 'X') {
                        ny = startY;
                        break;
                    }
                }
            } else if(op.equals("S")) {
                nx = startX + n;
                for(int i=startX+1; i<=nx; i++) {
                    if(i < 0 || i >= park.length || park[i].charAt(ny) == 'X') {
                        nx = startX;
                        break;
                    }
                }
            } else if(op.equals("N")) {
                nx = startX - n;
                for(int i=startX-1; i>=nx; i--) {
                    if(i < 0 || i >= park.length || park[i].charAt(ny) == 'X') {
                        nx = startX;
                        break;
                    }
                }
            }
            startX = nx;
            startY = ny;
            
        }
        return new int[]{startX, startY};
    }
}