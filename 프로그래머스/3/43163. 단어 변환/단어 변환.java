import java.util.*;

class Solution {
    static class Node {
        String word;
        int count;
        
        Node(String word, int count) {
            this.word = word;
            this.count = count;
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
        
        Queue<Node> queue = new LinkedList<>();
        boolean[] visited = new boolean[words.length];
        
        queue.offer(new Node(begin, 0));
        
        while(!queue.isEmpty()) {
            Node current = queue.poll();
            if(current.word.equals(target)) {
                return current.count;
            }
            for(int i=0; i<words.length; i++) {
                if(!visited[i] && check(current.word, words[i])) {
                    visited[i] = true;
                    queue.offer(new Node(words[i], current.count + 1));
                }
            }
        }
        return 0;
    }
    private boolean check(String str1, String str2) {
        int cnt = 0;
        for(int i=0; i<str1.length(); i++) {
            if(str1.charAt(i) == str2.charAt(i)) {
                cnt ++;
            }
        }
        if(cnt == str1.length() - 1) return true;
        return false;
    }
}