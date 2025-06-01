class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i=0; i<arr1.length; i++) {
            String s1 = Integer.toString(arr1[i], 2);
            String s2 = Integer.toString(arr2[i], 2);
            
            StringBuffer sb1 = new StringBuffer(s1);
            StringBuffer sb2 = new StringBuffer(s2);
            
            while(sb1.length() != n) {
                sb1.insert(0, "0");
            }
            
            while(sb2.length() != n) {
                sb2.insert(0, "0");
            }
            
            s1 = sb1.toString();
            s2 = sb2.toString();
            
            String str = "";
            for(int j=0; j<n; j++) {
                if(s1.charAt(j) == '1' || s2.charAt(j) == '1') {
                    str += "#";
                } else {
                    str += " ";
                }
            }
            answer[i] = str;
        }
        return answer;
    }
}