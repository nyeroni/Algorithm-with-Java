import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        int cnt = 0;
        boolean flag = false;
        Queue<String> queue = new LinkedList<>();
        boolean []visited = new boolean[words.length];
        for(int i=0; i<words.length; i++) {
            if(words[i].equals(target)) {
                flag = true;
            }
        }
        if(!flag) return 0;
        queue.offer(begin);
        flag = false;
        while(!queue.isEmpty()) {
            String now = queue.poll();
            if(check(now, target)) {
                flag = true;
                cnt ++;
                break;
            }
            for(int i=0; i<words.length; i++) {
                if(!visited[i]) {
                    if(check(now, words[i])) {
                        visited[i] = true;
                        cnt ++;
                        queue.offer(words[i]);
                        break;
                    }
                }
            }
        }
        if(!flag) return 0;
        return cnt;
    }
    private boolean check(String s, String target) {
        int cnt = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == target.charAt(i)) {
                cnt ++;
            }
        }
        if(cnt == s.length()-1) {
            return true;
        }
        return false;
    }
}