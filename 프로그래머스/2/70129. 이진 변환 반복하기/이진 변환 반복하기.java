class Solution {
    public int[] solution(String s) {
        String str = s;
        int answer = 0;
        int cnt = 0;
        while(true) {
            if(str.equals("1")) break;
            int n = removeOne(str);
            answer += n;
            int newNum = str.length() - n;
            str = Integer.toString(newNum, 2);
            cnt ++;
        }
        System.out.println("str : " + str);
        return new int[]{cnt, answer};
    }
    private int removeOne(String s) {
        int cnt = 0;
        for(int i : s.toCharArray()) {
            if(i == '0') {
                cnt ++;
            }
        }
        return cnt;
    }
}