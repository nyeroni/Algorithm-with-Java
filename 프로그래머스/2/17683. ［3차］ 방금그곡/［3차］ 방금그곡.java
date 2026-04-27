
import java.util.*;
class Solution {
    static class Song{
        int idx;
        int min;
        String name;
        Song(int idx, int min, String name) {
            this.idx = idx;
            this.min = min;
            this.name = name;
        }
    }
    public String solution(String m, String[] musicinfos) {
        m = change(m);
        String answer = "";
        List<Song> list = new ArrayList<>();
        for(int k=0; k<musicinfos.length; k++) {
            String musicinfo = change(musicinfos[k]);
            
            // System.out.println("start : musicinfo : " + musicinfo);
            String[] info = musicinfo.split(",");
            String[] start = info[0].split(":");
            String[] end = info[1].split(":");
            int startH = Integer.parseInt(start[0]);
            int startM = Integer.parseInt(start[1]);
            int endH = Integer.parseInt(end[0]);
            int endM = Integer.parseInt(end[1]);
            int H = endH - startH;
            int M = endM - startM;
            if(M < 0) {
                M += 60;
                H -= 1;
            }
            M += H * 60;
            if(M < m.length()) continue;
            // StringBuilder sb = new StringBuilder();
            int idx = 0;
            // System.out.println("M : " + M);
        
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<M; i++) {
                sb.append(info[3].charAt(i%info[3].length()));
            }
            if(sb.toString().contains(m)) {
                list.add(new Song(k, M, info[2]));
            }
        }
        if(list.size() == 0) return "(None)";
        Collections.sort(list, new Comparator<>() {
           public int compare(Song a, Song b) {
               if(b.min == a.min) return a.idx - b.idx;
               return b.min - a.min;
           } 
        });
    
        return list.get(0).name;
    }
    public String change(String c) {
        c = c.replaceAll("C#", "c");
        c = c.replaceAll("D#", "d");
        c = c.replaceAll("F#", "f");
        c = c.replaceAll("G#", "g");
        c = c.replaceAll("A#", "a");
        return c;
    }
}