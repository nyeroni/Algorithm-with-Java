import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        boolean flag = false;
        for(String s : words) {
            if(s.equals(target)) flag = true;
        }
        if(!flag) return 0;
        Queue<String> queue = new LinkedList<>();
        boolean[] visited = new boolean[words.length];
        queue.offer(begin);
        int answer = 0;
        while(!queue.isEmpty()) {
            String str = queue.poll();
            System.out.println("str : " + str);
            if(check(str, target)) {
                answer ++;
                break;
            }
            for(int i=0; i<words.length; i++) {
                System.out.println("for");
                if(visited[i]) continue;
                if(check(str, words[i])) {
                    queue.offer(words[i]);
                    answer ++;
                    visited[i] = true;
                    break;
                }
            }
        }
        return answer;
    }
    private boolean check(String a, String b) {
        int cnt = 0;
        for(int i=0; i<a.length(); i++) {
            if(a.charAt(i) == b.charAt(i)) {
                cnt++;
            }
        }
        if(cnt == a.length()-1) return true;
        return false;
    }
}