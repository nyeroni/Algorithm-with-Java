class Solution {
    public int solution(int[] stones, int k) {
        int answer = 0;
        int left = 1;
        int right = 200000000;
        while(left <= right) {
            int mid = (left + right) / 2;
            if(!canCross(stones, k, mid)) {
                right = mid - 1;
            } else  {
                answer = mid;
                left = mid + 1;
            }
        }
        
        return answer;
    }
    public boolean canCross(int[] stones, int k, int people) {
        int cnt = 0;
        for(int i=0; i<stones.length; i++) {
            if(stones[i] - people >= 0) {
                cnt = 0;
            } else {
                cnt ++;
                if(cnt >= k) return false;
            }
        }
        return true;
    }
}