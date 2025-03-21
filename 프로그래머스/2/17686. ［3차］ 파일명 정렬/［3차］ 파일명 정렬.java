import java.util.*;

class Solution {
    public String[] solution(String[] files) {
        String[] answer;
        List<String[]> strList = new ArrayList<>();
        for(int i=0; i<files.length; i++) {
            String [] tmp = new String[3];
            String str = "";
            int idx = -1;
            boolean flag = false;
            for(int j=0; j<files[i].length()-1; j++) {
            
                if(files[i].charAt(j) >= '0' && files[i].charAt(j) <= '9') {
                
                    if(!flag) {
                        System.out.println("0.str : " + str);
                        tmp[0] = str;
                        flag = true;
                        str = "";
                    }
                    if(files[i].charAt(j+1) < '0' || files[i].charAt(j+1) > '9') {
                        str += String.valueOf(files[i].charAt(j));
                        idx = j+1;
                        System.out.println("idx : " + idx);
                        break;
                    }
                    if(j+1 == files[i].length() -1) {
                        str += String.valueOf(files[i].charAt(j));
                       str += String.valueOf(files[i].charAt(j+1));                  
                     
                       break;
                   }
                }
                else {
                   if(j+1 == files[i].length() -1) {
                      str += String.valueOf(files[i].charAt(j));
                   System.out.println("0.str : " + str);
                       tmp[0] = str;
                       str = String.valueOf(files[i].charAt(j+1));                  
                     
                       break;
                   }
                }
                str += String.valueOf(files[i].charAt(j));

                System.out.println("str : " + str);
            }
            System.out.println("success");
            System.out.println("1.str : " + str);
            tmp[1] = str;
            str = "";
            if(idx == -1) {
                tmp[2] = "";
                strList.add(tmp);
                continue;
            }
            if(idx < files[i].length()) {
                System.out.println("iiidx = " + idx);
                for(int j = idx; j<files[i].length(); j++) {
                    str+= String.valueOf(files[i].charAt(j));
                }
            }
            System.out.println("===Str : " + str) ;
            tmp[2] = str;
            strList.add(tmp);
        }
        System.out.println("size : " + strList.size());
        strList.sort((a, b) -> {
            String A = a[0].toLowerCase();
            String B = b[0].toLowerCase();
           int first = A.compareTo(B);
            if(first != 0) {
                return first;
            }
             int second = Integer.compare(Integer.parseInt(a[1]), Integer.parseInt(b[1]));
            return second;
            
            
        });
        
        String tmpStr = "";
        int i=0;
        answer = new String[strList.size()];
        for(String[] s : strList) {
            String ts = "";
            for(String st : s) {
                ts += st;
            }
            answer[i] = ts;
            i++;
        }
        return answer;
    }
}