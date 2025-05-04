class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        String[] str = s.split(" ", -1);
        for(String ss : str) {
            // System.out.println("ss : " + ss);
            if(ss.equals(" ")) {
                answer += " ";
                continue;
            }
            for(int i=0; i<ss.length(); i++) {
                if(i%2==0) {
                    answer += String.valueOf(ss.charAt(i)).toUpperCase();
                } else {
                    answer += ss.charAt(i);
                }
            }
            answer += " ";
        }
        answer = answer.substring(0, answer.length()-1);
        return answer;
    }
}