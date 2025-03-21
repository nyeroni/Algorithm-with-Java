import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        String[] answer;
        Map<String, String> userID = new LinkedHashMap<>();
        List<String[]> order = new ArrayList<>();
        for(int i=0; i<record.length; i++) {
            String[] rec = record[i].split(" ");
            if(rec[0].equals("Enter")) {
                userID.put(rec[1], rec[2]);
                order.add(new String[]{rec[1], "Enter"});
            } else if(rec[0].equals("Leave")) {
                order.add(new String[]{rec[1], "Leave"});
            } else if(rec[0].equals("Change")) {
                if(userID.containsKey(rec[1])) {
                   userID.replace(rec[1], rec[2]); 
                }
            }
        
        }
        List<String> result = new ArrayList<>();
        for(String[] s : order) {
            String str = "";
            String name = userID.get(s[0]);
            if(s[1].equals("Enter")) {
                str = name + "님이 들어왔습니다.";
            } else if(s[1].equals("Leave")) {
                str = name + "님이 나갔습니다.";
            }
            result.add(str);
        }
       
        return result.toArray(new String[0]);

    }
}