import java.util.*;

class Solution {
    static class Word {
        String word;
        int depth;
        Word(String word, int depth) {
            this.word = word;
            this.depth = depth;
        }
    }
    public int solution(String begin, String target, String[] words) {
        boolean exists = false;
        for(String word : words) {
            if(word.equals(target)) {
                exists = true;
                break;
            }
        }
        if(!exists) return 0;
        
        boolean[] visited = new boolean[words.length];
        Queue<Word> queue = new LinkedList<>();
        queue.offer(new Word(begin, 0));
        
        while(!queue.isEmpty()) {
            Word current = queue.poll();
            if(current.word.equals(target)) {
                return current.depth;
            }
            for(int i=0; i<words.length; i++) {
                if(!visited[i] && check(words[i], current.word)) {
                    visited[i] = true;
                    queue.offer(new Word(words[i], current.depth + 1));
                }
            }
        }
        return 0;
    }
    public boolean check(String a, String b) {
        int cnt = 0;
        for(int i=0; i<a.length(); i++) {
            if(a.charAt(i) == b.charAt(i)) {
                cnt ++;
            }
        }
        if(cnt == a.length()-1) return true;
        return false;
    }
}