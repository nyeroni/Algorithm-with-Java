class Solution {
    public int solution(String s) {
        int answer = s.length();
        for(int size = 1; size<=s.length()/2; size++) {
            StringBuilder sb = new StringBuilder();
            String prev = s.substring(0, size);
            int count = 1;
            
            for(int i=size; i<s.length(); i+=size) {
                int end = Math.min(i + size, s.length());
                String now = s.substring(i, end);
                if(now.equals(prev)) {
                    count ++;
                } else {
                    if(count > 1) {
                        sb.append(count);
                    }
                    sb.append(prev);
                    prev = now;
                    count = 1;
                }
            }
            if(count > 1) {
                sb.append(count);
            }
            sb.append(prev);
            answer = Math.min(answer, sb.length());
            
        }
        return answer;
    }
}