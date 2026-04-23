class Solution {
    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        int cover = 2 * w + 1;
        int start = 1;
        for(int s : stations) {
            int left = s-w;
            if (start < left) {
                int len = left - start;
                if(len%cover == 0) answer += len/cover;
                else answer += len/cover + 1;
            }
            start = s + w + 1;
        }
        if(start <= n) {
            int len = n - start + 1;
            if(len%cover == 0) answer += len/cover;
            else answer += len/cover + 1;            
        }
        return answer;
    }
}