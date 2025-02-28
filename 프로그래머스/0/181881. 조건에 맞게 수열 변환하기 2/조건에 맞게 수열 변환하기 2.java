class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        boolean flag = false;
        while(true) {
            flag = false;
            for(int i=0; i<arr.length; i++) {
                if(arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] = arr[i] / 2;
                    flag = true;
                }
                else if(arr[i] < 50 && arr[i] % 2 != 0) {
                    arr[i] = arr[i] * 2 + 1;
                    flag = true;
                }
            }
            if(flag == false) {
                break;
            }
            answer ++;
        }
        return answer;
    }
}