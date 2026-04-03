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
        Map<String, Integer> genreTotal = new HashMap<>();
        Map<String, List<Song>> genreSongs = new HashMap<>();
        for(int i=0; i<genres.length; i++) {
            genreTotal.put(genres[i], genreTotal.getOrDefault(genres[i], 0) + plays[i]);
            if(!genreSongs.containsKey(genres[i]))
                genreSongs.put(genres[i], new ArrayList<>());
            genreSongs.get(genres[i]).add(new Song(i, plays[i]));
        }
        
        List<String> genreList = new ArrayList<>(genreTotal.keySet());
        genreList.sort((a, b) -> genreTotal.get(b) - genreTotal.get(a));
        
        List<Integer> answer = new ArrayList<>();
        for(String genre : genreList) {
            List<Song> songs = genreSongs.get(genre);
            songs.sort((a, b) -> {
                if(b.play == a.play) {
                    return a.idx - b.idx;
                }
                return b.play - a.play;
            });
            for(int i=0; i<Math.min(2, songs.size()); i++) {
                answer.add(songs.get(i).idx);
            }
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}