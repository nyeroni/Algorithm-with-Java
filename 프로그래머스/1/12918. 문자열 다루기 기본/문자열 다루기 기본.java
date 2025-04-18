class Solution {
    public boolean solution(String s) {
        String tmp = s;
        if(s.length() != 4 && s.length() != 6) return false;
        tmp = tmp.replaceAll("[^[0-9]]", "");
        if(tmp.length() != s.length()) return false;
        System.out.println("tmp : " + tmp);
        return true;
    }
}