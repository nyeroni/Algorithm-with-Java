class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int a = (total - num * (num + 1)/2) / num + 1;
        for(int i=0; i<num; i++) {
            answer[i] = a + i;
        }
        
        return answer;
    }
    // 0 5
    // sum = n(n-1)/2
    // 1 + 2 + 3 
    // 만약 3 + 4 + 5 => (2 + 1) + (2 + 2 ) + (2 + 3)
    // -> 2 * n + n(n+1)/2 = total
    // (a - 1) * n + n(n+1)/2 = total;
    // a = (total - n(n+1)/2)/n + 1;
}