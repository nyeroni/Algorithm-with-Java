class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String []num = new String[2];
        for(int i=0; i<binomial.length(); i++) {
            if(binomial.charAt(i) == '+') {
                num = binomial.split("\\+");
                answer = Integer.parseInt(num[0].trim()) + Integer.parseInt(num[1].trim());
                break;
            } else if(binomial.charAt(i) == '-') {
                num = binomial.split("-");
                answer = Integer.parseInt(num[0].trim()) - Integer.parseInt(num[1].trim());
                break;
            } else if(binomial.charAt(i) == '*') {
                num = binomial.split("\\*");
                answer = Integer.parseInt(num[0].trim()) * Integer.parseInt(num[1].trim());
                break;
            }
        }
        return answer;
    }
}