class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        if(A.equals(B)) return 0;
        int n = A.length();
        A = A + A;
        
        boolean flag = false;
        for(int i=0; i<n; i++) {
            String tmp = A.substring(i, i + n);
            if(tmp.equals(B)) {
                answer = i;
                flag = true;
            }
        }
        if(!flag)return -1;
        return n-answer;
    }
}