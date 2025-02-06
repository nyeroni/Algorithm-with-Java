class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int min = 1000001;
        
        for(int j=0; j<queries.length; j++) {
            for(int i=queries[j][0]; i<=queries[j][1]; i++) {
                if(queries[j][2] < arr[i]) {
                    if( min >= arr[i]) min = arr[i];
                }
            }
            if(min == 1000001) min = -1;
            answer[j] = min;
            min = 1000001;
        }
        
        return answer;
    }
}