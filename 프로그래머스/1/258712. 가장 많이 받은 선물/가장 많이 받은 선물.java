import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<friends.length; i++) {
            map.put(friends[i], i);
        }
        
        int[][] compare = new int[gifts.length][gifts.length];
        int[] give = new int[friends.length];
        int[] get = new int[friends.length];
        for(int i=0; i<gifts.length; i++) {
            String[] str = gifts[i].split(" ");
            // System.out.println("map.get(str[0]) : " + map.get(str[0]));
            // System.out.println("map.get(str[1]) : " + map.get(str[1]));
            compare[map.get(str[0])][map.get(str[1])] ++;
            give[map.get(str[0])] ++;
            get[map.get(str[1])] ++;
        }
                
        int[] answer = new int[friends.length];
        for(int i=0; i<friends.length-1; i++) {
            for(int j=i+1; j<friends.length; j++) {
                // System.out.println("compare[i][j] : " + compare[i][j] + ", compare[j][i] : " + compare[j][i]);

                if(compare[i][j] > compare[j][i]) {
                    answer[i] ++;
                } else if(compare[i][j] < compare[j][i]) {
                    answer[j] ++;
                } else {
                    int a = give[i] - get[i];
                    int b = give[j] - get[j];
                    if(a > b) {
                        answer[i] ++;
                    } else if(a < b) answer[j] ++;
                }
            }
        }

        Arrays.sort(answer);
        return answer[answer.length-1];
    }
}