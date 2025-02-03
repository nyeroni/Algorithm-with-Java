import java.util.*;

class Solution {
    static int pM, pS;
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        int vM, vS, osM, osS, oeM, oeS;
        String []tmp = video_len.split(":");
        vM = Integer.parseInt(tmp[0]);
        vS = Integer.parseInt(tmp[1]);
        
        tmp = pos.split(":");
        pM = Integer.parseInt(tmp[0]);
        pS = Integer.parseInt(tmp[1]);

        tmp = op_start.split(":");
        osM = Integer.parseInt(tmp[0]);
        osS = Integer.parseInt(tmp[1]);

        tmp = op_end.split(":");
        oeM = Integer.parseInt(tmp[0]);
        oeS = Integer.parseInt(tmp[1]);
        
        opening(osM, osS, oeM, oeS);

        for(int i=0; i<commands.length; i++) {
            opening(osM, osS, oeM, oeS);
            if(commands[i].equals("prev")) {
                prev();
            } 
            else if(commands[i].equals("next")) {
                next(vM, vS);
            }
            opening(osM, osS, oeM, oeS);
        }

        if(pM < 10) answer += "0" + pM;
        else answer += pM;
        answer += ":";
        if(pS <10) answer += "0" + pS;
        else answer += pS;
        return answer;
    }
    public void prev() {
        if(pS - 10 >= 0) {
            pS = pS - 10;
        } else {
            if(pM - 1 < 0) {
                pM = 0;
                pS = 0;
            } else {
                pM = pM - 1;
                pS = pS + 60 - 10;
            }
            
        }
    }
    public void next(int vM, int vS) {
        if(pS + 10 >= 60) {
            if(pM + 1 > vM) {
                pM = vM;
                pS = vS;
            } 
            else if(pM + 1 == vM && pS + 10 - 60 >= vS) {
                pM = vM;
                pS = vS;
            } 
            else {
                pM = pM + 1;
                pS = pS + 10 - 60;
            }
        } else {
            if(pM >= vM && pS + 10 > vS) {
                pS = vS;
                pM = vM;
            }
            else pS = pS + 10;
        }
    }
    public void opening(int osM, int osS, int oeM, int oeS) {
        if(pM > osM && pM < oeM) {
            pM = oeM;
            pS = oeS;
        } 
        else if(pM == osM && pS>= osS && pS<=59 && pM < oeM) {
            pM = oeM;
            pS = oeS;
        }
        else if(pM == osM && pM == oeM && (pS >= osS && pS <= oeS)) {
            pM = oeM;
            pS = oeS;
        }
        else if(pM == oeM && pS <= oeS && pM > osM) {
            pM = oeM;
            pS = oeS;
        }
    }
}