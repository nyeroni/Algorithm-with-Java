class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int [numbers.length];
        if(direction.equals("right")) {
            int tmp = numbers[numbers.length-1];
            answer[0] = tmp;
            for(int i=0; i<numbers.length-1; i++) {
                answer[i+1] = numbers[i];
            }
        }
        else if(direction.equals("left")) {
            int tmp = numbers[0];
            answer[0] = tmp;
            for(int i=1; i<numbers.length; i++) {
                answer[i-1] = numbers[i];
            }
            answer[numbers.length-1] = tmp;
        }
        return answer;
    }
}