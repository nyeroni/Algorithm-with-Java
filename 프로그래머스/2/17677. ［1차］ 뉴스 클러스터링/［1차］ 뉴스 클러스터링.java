import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        if(str1.equals(str2)) {
            return 65536;
        }
        List<String> str1Arr = makeArr(str1);
        List<String> str2Arr = makeArr(str2);
        
        System.out.println("str1");
        for(String s : str1Arr) {
            System.out.println("s : " + s);
        }
        System.out.println("str2");
        for(String s : str2Arr) {
            System.out.println("s : " + s);
        }
        int answer[] = calculate(str1Arr, str2Arr);
        
        int uni = answer[0];
        int inter = answer[1];
        System.out.println("inter : " + inter);
        System.out.println("uni : " + uni);

        if(uni!=0) {
            double ans = (double)inter / (double)uni;
            System.out.println("ans : " + ans);
            return (int)(ans * 65536.0);
        }
        return 0;
    }
    private int[] calculate(List<String> strA, List<String> strB) {
        List<String> str1 = new ArrayList<>(strA);
        List<String> str2 = new ArrayList<>(strB);
        List<String> sum = new ArrayList<>();
        List<String> mul = new ArrayList<>();
        for(String s : str1) {
            if(str2.contains(s)) {
                str2.remove(s);
                mul.add(s);
            }
            sum.add(s);
        }
        for(String s : str2) {
            sum.add(s);
        }
        return new int[]{sum.size(), mul.size()};
    }
    private List<String> makeArr(String str) {
        System.out.println("str : " + str);
        List<String> strArr = new ArrayList<>();
        for(int i=0; i<str.length()-1; i++) {
  
            if(!checkAlpa(str.charAt(i)) || !checkAlpa(str.charAt(i+1))) {
                continue;
            }
            
            strArr.add(String.valueOf(str.charAt(i)) + String.valueOf(str.charAt(i+1))); 
        }
        
        return strArr;
    }
    
    private boolean checkAlpa(char c) {
        if((c>='a' && c<='z' ) || (c>='A' && c<='Z')) {
            return true;
        }
        return false;
    }
}