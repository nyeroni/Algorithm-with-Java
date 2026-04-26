import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        Map<String, Integer> typeMap = new HashMap<>();
        Map<String, int[]> endDate = new HashMap<>();
        // int[] mon = {31}
        for(String term : terms) {
            String[] tmp = term.split(" ");
            typeMap.put(tmp[0], Integer.parseInt(tmp[1]));
        }
        List<Integer> answer = new ArrayList<>();
        // 1~n개의 개인정보
        // 약관마다 유효기간
        for(String privacie : privacies) {
            String[] tmp = privacie.split(" ");
            String[] date = tmp[0].split("\\.");
            int year = Integer.parseInt(date[0]);
            int month = Integer.parseInt(date[1]);
            int day = Integer.parseInt(date[2]);
            String type = tmp[1];
            day -= 1;
            month += typeMap.get(type);
            if(month > 12) {
                if(month%12 != 0) {
                    year += month / 12;
                    month = month % 12;
                } else {
                    year += ((month / 12 )- 1);
                    month = 12;
                }
            }
            // if(day == 0) {
            //     if(mon)
            // }
           
            endDate.put(privacie, new int[]{year, month, day});
        }
        String[] todayDate = today.split("\\.");
        int todayYear = Integer.parseInt(todayDate[0]);
        int todayMonth = Integer.parseInt(todayDate[1]);
        int todayDay = Integer.parseInt(todayDate[2]);
        
        int idx = 0;
        // System.out.println("todayYear : " + todayYear + ", todayMonth : " +todayMonth + ", todayDay : " + todayDay); 
        for(String privacie : privacies) {
            idx ++;
            // System.out.println("privacie : " + privacie); 
           int[] date = endDate.get(privacie);
            // System.out.println("date[0] : " + date[0] + ", date[1] : " + date[1] + ", date[2] : " + date[2]); 
            if(date[0] < todayYear) {
                answer.add(idx);
                continue;
            } else if(date[0] == todayYear) {
                if(date[1] < todayMonth) {
                    answer.add(idx);
                    continue;
                } else if(date[1] == todayMonth) {
                    if(date[2] < todayDay) {
                        answer.add(idx);
                        continue;
                    } else continue;
                } else {
                    continue;
                }
            } else {
                continue;
            }
        }
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}