import java.util.*;
class Solution {
    static class Stage{
        int number;
        Double failRate;
        
        Stage(int number, Double failRate) {
            this.number = number;
            this.failRate = failRate;
        }
    }
    public int[] solution(int N, int[] stages) {
        int[] stuck = new int[N+2];
        for(int s : stages) {
            stuck[s] ++;
        }
        // 0 1 3 2 1 0 1
        int players = stages.length;
        List<Stage> list = new ArrayList<>();
        for(int i=1; i<=N; i++) {
            double failRate = 0;
            if(players > 0) {
                failRate = (double) stuck[i] / players;
            }
            list.add(new Stage(i, failRate));
            players -= stuck[i];
        }
        list.sort((a, b) -> {
            if(a.failRate == b.failRate) {
                return a.number - b.number;
            }
            return Double.compare(b.failRate, a.failRate);
        });
        int[] answer = new int[N];
        for(int i=0; i<N; i++) {
            answer[i] = list.get(i).number;
        }
        return answer;
    }
}