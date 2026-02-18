class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i=0; i<n; i++) {
            String map1 = Integer.toBinaryString(arr1[i]);
            String map2 = Integer.toBinaryString(arr2[i]);
            StringBuffer sb1 = new StringBuffer(map1);
            StringBuffer sb2 = new StringBuffer(map2);
            while(sb1.length() != n) {
                sb1.insert(0, "0");
            }
            while(sb2.length() != n) {
                sb2.insert(0, "0");
            }
            map1 = sb1.toString();
            map2 = sb2.toString();
            
            String ans = "";
            for(int j=0; j<n; j++) {
                if(map1.charAt(j) == '1' || map2.charAt(j) == '1') {
                    ans += "#";
                } else ans += " ";
            }
            answer[i] = ans;
        }
        return answer;
    }
}