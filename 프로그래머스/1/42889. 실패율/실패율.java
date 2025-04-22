import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        List<Integer> tmp = new ArrayList<>();
        for(int i=0; i<stages.length; i++) {
            tmp.add(stages[i]);
        }
        tmp.sort(Comparator.reverseOrder());
        Map<Integer, Double> fail = new HashMap<>();
        for(int i=1; i<=N; i++) {
             if(tmp.indexOf(i) == -1) {
                fail.put(i, 0.0);
                 continue;
            }
            int m = (int) (tmp.lastIndexOf(i) + 1);
            int n = m - tmp.indexOf(i);
            
            fail.put(i, (double)n/(double)m);
        }

        List<Map.Entry<Integer, Double>> entryList = new ArrayList<>(fail.entrySet());
        entryList.sort((e1, e2) -> {
            int valueCompare = e2.getValue().compareTo(e1.getValue());
            if(valueCompare == 0) {
                return e1.getKey().compareTo(e2.getKey());
            }
            return valueCompare;
        });
    
        for(int i=0; i<entryList.size(); i++) {
            answer[i] = entryList.get(i).getKey();
        }
        return answer;
    }
}