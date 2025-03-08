class Solution {
    static int cnt = 0;
    static int zero = 0;
    public int[] solution(String s) {
        
        removeZero(s);
        int [] answer = {cnt, zero};
        return answer;
    }
    public void removeZero(String st) {
        if(st.equals("1")) return;
        cnt ++;
        int num = 0;
        for(int i=0; i<st.length(); i++) {
            if(st.charAt(i) == '1') {
                num ++;
            }
        }
        zero += st.length() - num;
        removeZero(binary(num));
    }
    public String binary(int num) {
        String str = "";
        while(num > 1) {
            str += num % 2;
            num /= 2;
        }
        str += num % 2;
        return str;
    } 
}