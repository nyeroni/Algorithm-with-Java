import java.util.*;

class Solution {
    public String solution(int n, int t, int m, String[] timetable) {
        List<Integer> crew = new ArrayList<>();
        for(String time : timetable) {
            String[] split = time.split(":");
            int hour = Integer.parseInt(split[0]);
            int minute = Integer.parseInt(split[1]);
            crew.add(hour * 60 + minute);
        }
        Collections.sort(crew);
        int busTime = 9 * 60;
        int idx = 0;
        
        int answer = 0;
        for(int i=0; i<n; i++) {
            int count = 0;
            while(idx < crew.size() && crew.get(idx) <= busTime && count < m) {
                idx ++;
                count ++;
            }
        
            if(i == n-1) {
                if(count < m) {
                    answer = busTime;
                } else {
                    answer = crew.get(idx-1) - 1;
                }
            }
            busTime += t;
        }
        int hour = answer / 60;
        int minute = answer % 60;
        return String.format("%02d:%02d", hour, minute);
    }
}