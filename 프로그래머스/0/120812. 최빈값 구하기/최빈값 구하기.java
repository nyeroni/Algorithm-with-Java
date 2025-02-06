class Solution {
    public int solution(int[] array) {
        int max = 0;
        for(int i=0; i<array.length; i++) {
            if(max < array[i]) {
                max = array[i];
            }
        }
        int[] arr = new int[max+1];
        for(int i=0; i<array.length; i++) {
            arr[array[i]] ++;
        }
        max = -1;
        int answer = 0;
        for(int i=0; i<arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
                answer = i;
            }
            else if(max == arr[i]) {
                max = -1;
                answer = -1;
            }
        }
        
        return answer;
    }
}