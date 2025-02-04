class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int []tmp = new int[n];
        for(int i=0; i<n; i++) {
            tmp[i] = num_list[i];
        }
        if(num_list.length > n) {
            int k=0;
            for(int i=n; i<num_list.length; i++) {
                answer[k] = num_list[i];
                k++;
            }
            for(int i=0; i<tmp.length; i++) {
                answer[k] = tmp[i];
                k++;
            }  
        }
        else if (num_list.length == n) {
            for(int i=0; i<tmp.length; i++) {
                answer[i] = tmp[i];
            }
        }

        return answer;
    }
}