import java.util.*;

class Solution {
    public int solution(String[][] book_time) {
        int answer = 0;
        Arrays.sort(book_time, new Comparator<>() {
           public int compare(String[] a, String[] b) {
               if(a[0].equals(b[0])) return a[1].compareTo(b[1]);
               return a[0].compareTo(b[0]);
           } 
        });
        Map<Integer, int[]> map = new HashMap<>();
        int room = 1;
        for(String[] s : book_time) {
            // System.out.println("s[0] : " + s[0] + ", s[1] : " + s[1]);
        }
        for(int i=0; i<book_time.length; i++) {
            String[] book = book_time[i];
            
            int startH = Integer.parseInt(book[0].split(":")[0]);
            int startM = Integer.parseInt(book[0].split(":")[1]);
            int endH = Integer.parseInt(book[1].split(":")[0]);
            int endM = Integer.parseInt(book[1].split(":")[1]) + 10;
            
            if(endM >= 60) {
                endM -= 60;
                endH ++;
            }
            for(int j=1; j<=room; j++) {
                // System.out.println("j : " + j + ", map.getOrDefault(j, new int[]{0, 0}) : " + map.getOrDefault(j, new int[]{0, 0}) + ", start Time : " + startH + ":" + startM);
                if(check(map.getOrDefault(j, new int[]{0, 0}), new int[]{startH, startM})) {
                    map.put(j, new int[]{endH, endM });
                    break;
                } else {
                    room ++;
                }
            }
        }
        return map.size();
    }
    public boolean check(int[] a, int[] b) {
       
        // System.out.println("a : " + a[0] + ":" + a[1] + ", b : " + b[0] +":" + b[1]);
        if(a[0] == b[0]) {
            if (a[1] <= b[1]) {
                return true;
            }
        }  
        if(a[0] < b[0]) {
            return true;
        }
        return false;
    }
}