import java.util.*;
class Solution {
    static class Work{
        int num;
        int startTime;
        int workTime;
        Work(int num, int startTime, int workTime) {
            this.num = num;
            this.startTime = startTime;
            this.workTime = workTime;
        }
    }
    public int solution(int[][] jobs) {
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);
        PriorityQueue<Work> pq = new PriorityQueue<>((a, b) -> {
            if(a.workTime == b.workTime) {
                if(a.startTime == b.startTime) {
                    return a.num - b.num;
                }
                return a.startTime - b.startTime;
            }
            return a.workTime - b.workTime;
        });
       
        int idx = 0;
        int time = 0;
        int count = 0;
        int sum = 0;
        while(count < jobs.length) {
            while(idx < jobs.length && jobs[idx][0] <= time) {
                pq.offer(new Work(idx, jobs[idx][0], jobs[idx][1]));
                idx++;
            }
            if(pq.isEmpty()) {
                time = jobs[idx][0];
                continue;
            }
            Work now = pq.poll();
            time += now.workTime;
            sum += (time - now.startTime);
            count ++;
        }
        return sum / jobs.length;
    
    }
}