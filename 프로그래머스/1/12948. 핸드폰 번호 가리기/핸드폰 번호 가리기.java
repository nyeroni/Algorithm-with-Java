class Solution {
    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder();
        int num = phone_number.length()-4;
        for(int i=0; i<num; i++) {
            sb.append('*');
        }
        sb.append(phone_number.substring(num));
        return sb.toString();
    }
}