import java.util.*;

class Solution {
    static class Word{
        String name;
        int count;
        Word(String name, int count) {
            this.name = name;
            this.count = count;;
        }
    }
    public int solution(String begin, String target, String[] words) {
        Queue<Word> queue = new LinkedList<>();
        queue.offer(new Word(begin, 0));
        boolean[] visited = new boolean[words.length];
        int answer = 0;
        boolean flag = false;
        for(String w : words) {
            if(w.equals(target)) flag = true;
        }
        if(!flag) return 0;
        
        while(!queue.isEmpty()) {
            Word now = queue.poll();
            // System.out.println("now.name : " + now.name + ", now.count : " + now.count + 1);
            if(check(now.name, target)) return now.count + 1;
            for(int i=0; i<words.length; i++) {
                if(!visited[i] && check(now.name, words[i])) {
                    // System.out.println("words[i] : " + words[i]);
                    visited[i] = true;
                    queue.offer(new Word(words[i], now.count + 1));
                }
            }
        }
        return 0;
    }
    public boolean check(String a, String b) {
        int cnt = 0;
        for(int i=0; i<a.length(); i++) {
            if(a.charAt(i) == b.charAt(i)) cnt ++;
        }
        if(cnt == a.length()-1) return true;
        return false;
    }
}