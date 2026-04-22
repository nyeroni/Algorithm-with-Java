import java.util.*;

class Solution {
    static class File{
        String fullName;
        String head;
        int num;
        File(String fullName, String head, int num) {
            this.fullName = fullName;
            this.head = head;
            this.num = num;
        }
    }
    public String[] solution(String[] files) {
        List<File> list = new ArrayList<>();
        for(String file : files) {
            StringBuilder sb = new StringBuilder();
            boolean flag = false;
            String s = file.toLowerCase();
            String head = "";
            int num = 0;
            for(char c : s.toCharArray()) {
                if(c >= '0' && c <= '9') {
                    if(!flag) {
                        head = sb.toString();
                        flag = true;
                        sb = new StringBuilder();
                    }
                    sb.append(c + "");
                } else if(!flag){
                    sb.append(c + "");
                } else if(flag){
                    flag = false;
                    num = Integer.parseInt(sb.toString());
                    break;
                }
                if(flag) {
                     num = Integer.parseInt(sb.toString());
                }
            }
            list.add(new File(file, head, num));
        }
        Collections.sort(list, new Comparator<>(){
           public int compare(File a, File b) {
               if(a.head.equals(b.head)) {
                   return a.num - b.num;
               } 
               return a.head.compareTo(b.head);
           } 
        });
        String[] answer = new String[list.size()];
        int k=0;
        for(File file : list) {
            answer[k++] = file.fullName;
        }
        return answer;
    }
}