import java.util.*;
class Solution {
    static class Game{
        int idx;
        double fail;
        Game(int idx, double fail) {
            this.idx = idx;
            this.fail = fail;
        }
    }
    public int[] solution(int N, int[] stages) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> answer = new ArrayList<>();
        List<Game> list = new ArrayList<>();
        int member = stages.length;
        for(int i=0; i<stages.length; i++) {
            map.put(stages[i], map.getOrDefault(stages[i], 0) + 1);
        } 
        for(int i=1; i<=N; i++) {
            int count = map.getOrDefault(i, 0);
            // System.out.println("map.getOrDefault(i) : " + map.getOrDefault(i, 0) + ", member : " + member);
            if(member > 0) list.add(new Game(i, (double) map.getOrDefault(i, 0) / member));
            else list.add(new Game(i, 0.0));
            member -= count;
        }
        Collections.sort(list, new Comparator<>() {
            public int compare(Game a, Game b) {
                if(b.fail==a.fail) {
                    return 0;
                }
                else if(b.fail < a.fail) {
                    return -1;
                } else return 1;
            }
        });
        for(Game g : list) {
            answer.add(g.idx);
            // System.out.println("g.idx : " + g.idx + ", g.fail : " + g.fail);
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}