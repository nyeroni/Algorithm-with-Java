class Solution {
    static int answer = Integer.MAX_VALUE;
    public int solution(int[] picks, String[] minerals) {
        dfs(picks, minerals, 0, 0);
        return answer;
    }
    public void dfs(int[] picks, String[] minerals, int idx, int sum) {
        if(idx >= minerals.length || picks[0] == 0 && picks[1] == 0 && picks[2] == 0) {
            answer = Math.min(answer, sum);
            return;
        }
        for(int i=0; i<3; i++) {
            if(picks[i] == 0) continue;
            picks[i] --;
            int cost = 0;
            for(int j=idx; j<Math.min(idx + 5, minerals.length); j++) {
                cost += getCost(i, minerals[j]);
            }
            dfs(picks, minerals, idx + 5, sum + cost);
            picks[i] ++;
        }
    }
    public int getCost(int pick, String minerals) {
        if(pick == 0) return 1;
        else if (pick == 1) {
            if(minerals.equals("diamond")) {
                return 5;
            } return 1;
        } else {
            if(minerals.equals("diamond")) {
                return 25;
            } else if(minerals.equals("iron")) {
                return 5;
            }
            return 1;
        }
    }
}