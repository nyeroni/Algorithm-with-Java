import java.util.*;
class Solution {
    class Music {
        int idx;
        // boolean visited;
        String genre;
        int play;
        
        public Music(int idx, String genre, int play) {
            this.idx = idx;
            this.genre = genre;
            this.play = play;
        }
    }
    public int[] solution(String[] genres, int[] plays) {
        List<Music> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
    
        for(int i=0; i<genres.length; i++) {
            Music m = new Music(i, genres[i], plays[i]);
            list.add(m);
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }
        Collections.sort(list, (a, b) -> (b.play-a.play));
        List<Map.Entry<String, Integer>> genresList = new ArrayList<>(map.entrySet());
        Collections.sort(genresList, (a, b)->(b.getValue()-a.getValue()));
        List<Integer> answer = new ArrayList<>();
        for(int i=0; i<genresList.size(); i++) {
            int cnt=0;
            for(int j=0; j<list.size(); j++){
                // if(list.get(j).visited) continue;
                if(list.get(j).genre.equals(genresList.get(i).getKey())) {
                    answer.add(list.get(j).idx);
                    cnt++;
                    // list.get(j).visited = true;
                }
                if(cnt == 2) {
                    break;
                }
            }
        }
        
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}