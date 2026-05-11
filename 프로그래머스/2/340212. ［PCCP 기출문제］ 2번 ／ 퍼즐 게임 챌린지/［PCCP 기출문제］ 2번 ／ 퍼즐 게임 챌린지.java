class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        // n개의 퍼즐을 제한 시간 내 풀어야함
        // 난이도와 소요시간
        // 숙련도에 따라 틀리는 횟수가 달라짐
        // diff : 현재 퍼즐의 난이도
        // time_cur : 현재 퍼즐의 소요시간
        // time_prev : 이전 퍼즐의 소요시간
        // level : 당신의 숙련도
        // diff <= level -> 퍼즐 안틀림 time_cur만큼 사용
        // diff > level -> diff - level번 틀림 -> 틀릴때마다 time_cur 사용 + time_prev만큼 사용해 이전 퍼즐 다시 풀어야함
        // 이전 퍼즐을 다시 풀 때 이전 퍼즐의 난이도에 상관없이 틀리지 않음
        int answer = Integer.MAX_VALUE;
        int right = 0;
        int left = Integer.MAX_VALUE;
        for(int diff : diffs) {
            if(right < diff) {
                right = diff;
            }
            if(left > diff) {
                left = diff;
            }
        }
        while(left <= right) {
            long time = 0;
            int mid = (left + right)/2;
            for(int i=0; i<diffs.length; i++) {
                if(diffs[i] <= mid) {
                    time += (long)times[i];
                } else {
                    time += (long)(times[i] + times[i-1]) * (diffs[i] - mid) + times[i];
                }
            }
            if(time <= limit) {
                answer = mid;
                right = mid-1;
            } else {
                left = mid + 1;
            }
        }
        return answer;
    }
}