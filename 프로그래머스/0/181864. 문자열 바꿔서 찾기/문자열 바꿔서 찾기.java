class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String newString = "";
        for(int i=0; i<myString.length(); i++) {
            if(myString.charAt(i) == 'A') {
                newString += "B";
            } else if(myString.charAt(i) == 'B') {
                newString += "A";
            }
        }
        if(newString.contains(pat)) answer = 1;
        else answer = 0;
        return answer;
    }
}