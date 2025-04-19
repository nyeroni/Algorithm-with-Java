class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        String[] str = s.split(" ", -1);

        for(String st : str) {
            for(int i=0; i<st.length(); i++) { 
                if(i % 2 == 0) {
                    char c = Character.toUpperCase(st.charAt(i));
                    answer += String.valueOf(c);
                } else {
                    char c = Character.toLowerCase(st.charAt(i));
                    answer += String.valueOf(c);                }
            }
            answer += " ";
        }
        answer = answer.substring(0, answer.length()-1);
        return answer;
    }
}