class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        //|rdx - lux| + |rdy - luy|
        int rdx=0, rdy=0, lux=wallpaper.length, luy=wallpaper[0].length();
        for(int i=0; i<wallpaper.length; i++) {
            for(int j=0; j<wallpaper[0].length(); j++) {
                if(wallpaper[i].charAt(j) == '#') {
                    if(lux > i) {
                        lux = i;
                    }
                    if(luy > j) {
                        luy = j;
                    }
                    if(rdx < i) {
                        rdx = i;
                    }
                    if(rdy < j) {
                        rdy = j;
                    }
                }
            }
        }
        return new int[]{lux, luy, rdx+1, rdy+1};
    }
}