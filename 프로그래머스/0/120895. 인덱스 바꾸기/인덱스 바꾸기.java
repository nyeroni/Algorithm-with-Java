class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] tmp = my_string.split("");
        String t = tmp[num1];
        tmp[num1] = tmp[num2];
        tmp[num2] = t;
        
        answer = String.join("", tmp);
        return answer;
    }
}