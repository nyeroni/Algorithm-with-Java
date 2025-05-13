class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = array[0];
        int index = 0;
        for(int i=1; i<array.length; i++) {
            if(max < array[i]) {
                max = array[i];
                index = i;
            }
        }
        answer[0] = array[index];
        answer[1] = index;
        return answer;
    }
}