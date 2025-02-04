class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        int answer = level(diffs, times, limit);
        return answer;
    }
    public long calculate(int[] diffs, int[] times, long limit, int level)  {
            long time = 0;
            int answer = 0;

            for(int i=0; i<diffs.length; i++) {
                if(diffs[i] <= level) {
                    time += times[i];
                } else {
                    
                    int fail = diffs[i] - level;
                    int tmp = (times[i] + times[i-1]) * fail + times[i];
                    time += tmp;
                }
            }
        return time;
    }
    public int level(int[] diffs, int[] times, long limit) {
        int min = 1;
        int max = 100000;
        
        
        while(min<=max) {
            int level = (min + max) / 2;
            long time = calculate(diffs, times, limit, level); 
            if(time > limit) {
                min = level + 1;
            } else {
                max = level - 1;
            }
        }
        return max+1;
    }
}