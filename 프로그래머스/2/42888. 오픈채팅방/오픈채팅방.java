import java.util.*;

class Solution {
    static class Status {
        String id;
        String status;
        
        Status(String id, String status) {
            this.id = id;
            this.status = status;
        }
    }
    public String[] solution(String[] record) {
        Map<String, String> name = new HashMap<>();
        List<Status> list = new ArrayList<>();
        for(String r : record) {
            String[] tmp = r.split(" ");
            if(tmp[0].equals("Enter")) {
                name.put(tmp[1], tmp[2]);
                list.add(new Status(tmp[1], "Enter"));
            }
            else if(tmp[0].equals("Leave")){
                list.add(new Status(tmp[1], "Leave"));
            } else if(tmp[0].equals("Change")) {
                name.put(tmp[1], tmp[2]);
            }
        }
        String[] answer = new String[list.size()];
        int i=0;
        for(Status s : list) {
            if(s.status.equals("Enter")) {
                answer[i] = name.get(s.id) + "님이 들어왔습니다.";
            }
            else if(s.status.equals("Leave")) {
                answer[i] = name.get(s.id) + "님이 나갔습니다.";
            }
            i++;
        }
                    
        return answer;
    }
}