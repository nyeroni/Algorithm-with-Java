class Solution {
    public int solution(String name) {
        int answer = 0;
        int min = name.length();
        for(int i=0; i<name.length(); i++) {
            int n = Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);
            answer += n;
            int next = i + 1;
            while (next < name.length() && name.charAt(next) == 'A') {
                next++;
            }
            min = Math.min(min, i * 2 + name.length() - next);
            min = Math.min(min, (name.length() - next) * 2 + i);

        }

        return answer + min;
    }
}