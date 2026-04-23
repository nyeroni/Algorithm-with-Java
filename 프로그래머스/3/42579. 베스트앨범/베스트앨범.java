import java.util.*;
class Solution {
    static class Song{
        int idx;
        int play;
        Song(int idx, int play) {
            this.idx = idx;
            this.play = play;
        }
    }
    public int[] solution(String[] genres, int[] plays) { 
        Map<String, Integer> playsMap = new HashMap<>();
        Map<String, List<Song>> songMap = new HashMap<>();
        for(int i=0; i<genres.length; i++) {
            playsMap.put(genres[i], playsMap.getOrDefault(genres[i], 0) + plays[i]);
            if(!songMap.containsKey(genres[i])) {
                songMap.put(genres[i], new ArrayList<>());
            }
            songMap.get(genres[i]).add(new Song(i, plays[i]));
        }
    
        List<String> list = new ArrayList<>(playsMap.keySet());
        list.sort((a, b) -> playsMap.get(b) - playsMap.get(a));
        List<Integer> answer = new ArrayList<>();
        for(String genre : list) {
            List<Song> now = songMap.get(genre);
            now.sort((a, b) -> {
                if(a.play == b.play) {
                    return a.idx - b.idx;
                }
                return b.play - a.play;
            });
            for(int i=0; i<Math.min(2, now.size()); i++) {
                answer.add(now.get(i).idx);
            }
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}