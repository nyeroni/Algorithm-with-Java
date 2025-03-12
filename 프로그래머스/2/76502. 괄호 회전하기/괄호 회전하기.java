import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String tmp = s;
        boolean flag = true;
        for(int j=0; j<s.length(); j++) {
            Stack<String> st = new Stack<>();
            for(int i=0; i<s.length(); i++) {
                flag = true;
                if(tmp.charAt(i) == '[' || tmp.charAt(i) == '(' || tmp.charAt(i) == '{') {
                    st.push(String.valueOf(tmp.charAt(i)));
                } else if(tmp.charAt(i) == ']') {
                    if(st.empty()) {
                        flag = false;
                        break;
                    }
                    if(!st.empty() && st.peek().equals("[") ) {
                        st.pop();
                    }
                } else if(tmp.charAt(i) == ')') {
                     if(st.empty()) {
                         flag = false;
                        break;
                      }       
                    if(!st.empty() && st.peek().equals("(") ) {
                        st.pop();
                    }
                }
                else if(tmp.charAt(i) == '}') {
                    if(st.empty()) {
                        flag = false;
                        break;
                    }
                    if(!st.empty() && st.peek().equals("{"))  {
                        st.pop();
                    }
                }
            }
            if(st.empty() && flag) {
                answer ++;
            }
            String tmpStr = String.valueOf(tmp.charAt(0));
            tmp = tmp.substring(1, tmp.length());
            tmp += tmpStr;
        }
        return answer;
    }
}