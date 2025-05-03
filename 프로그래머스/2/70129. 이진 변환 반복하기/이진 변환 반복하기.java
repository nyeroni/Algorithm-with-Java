class Solution {
    public int[] solution(String s) {
        String str = "";
        int count = 0;
        int zero = 0;
        int []answer = new int[2];
        while(true) {
            if(s.length() == 1) break;
            for(int i=0; i<s.length(); i++) {
                if(s.charAt(i) == '1') {
                    str += "1";
                } else {
                    zero ++;
                }
            }
            System.out.println("s : " + s);
            s = Integer.toBinaryString(str.length());
            str = "";
            count ++;
        }
        answer[0] = count;
        answer[1] = zero;
        return answer;
    }
}