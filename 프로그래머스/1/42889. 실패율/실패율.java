import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=1; i<=N; i++) {
            map.put(i, 0);
        }
        
        for(int i=0; i<stages.length; i++) {
            if(stages[i] <= N)
                map.put(stages[i], map.getOrDefault(stages[i], 0) + 1);
        }
        double n = stages.length;
        Map<Integer, Double> result = new HashMap<>();

        for(int i=1; i<=N; i++) {
            if(n==0) result.put(i, 0.0);
            else result.put(i, ((double)map.get(i)/(double)n));
            n-=map.get(i);
        }
        
        List<Integer> list = new ArrayList<>(result.keySet());
       
        list.sort((a, b) -> {
            int cmp = Double.compare(result.get(b), result.get(a));
            if(cmp != 0) return cmp;
            return Integer.compare(a, b);
        });
        
        return list.stream().mapToInt(i->i).toArray();
    }
}