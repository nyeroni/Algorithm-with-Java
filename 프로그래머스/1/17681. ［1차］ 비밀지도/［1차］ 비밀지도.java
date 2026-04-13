class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i=0; i<arr1.length; i++) {
            int a = arr1[i];
            int b = arr2[i];
            String sa = toBinary(a, n);
            String sb = toBinary(b, n);
            answer[i] = calculate(sa, sb, n);
        }
        return answer;
    }
    public String toBinary(int num, int n) {
        String s = Integer.toString(num, 2);
        StringBuilder sb = new StringBuilder();
        if(s.length() != n) {
            for(int i=0; i<n - s.length(); i++) {
                sb.append("0");
            }
        }
        sb.append(s);
        return sb.toString();
    }
    public String calculate(String a, String b, int n) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++) {
            if(a.charAt(i) == '1' || b.charAt(i) == '1') {
                sb.append("#");
            } else sb.append(" ");
        }
        return sb.toString();
    }
}