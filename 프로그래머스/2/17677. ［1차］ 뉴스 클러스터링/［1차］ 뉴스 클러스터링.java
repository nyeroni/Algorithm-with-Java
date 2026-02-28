import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        double answer = 0;
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();    
        String s = "";
        for(int i=0; i<str1.length()-1; i++) {
            if(str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z' && str1.charAt(i+1) >= 'A' && str1.charAt(i+1) <= 'Z') {
                s = String.valueOf(str1.charAt(i)) + String.valueOf(str1.charAt(i+1));
                list1.add(s);
            }
        }
        for(int i=0; i<str2.length()-1; i++) {
            if(str2.charAt(i) >= 'A' && str2.charAt(i) <= 'Z' && str2.charAt(i+1) >= 'A' && str2.charAt(i+1) <= 'Z') {
                s = String.valueOf(str2.charAt(i)) + String.valueOf(str2.charAt(i+1));
                list2.add(s);
            }
        }
        double a = 0, b = list1.size() + list2.size();
        for(String ss : list2) {
            if(list1.contains(ss)) {
                // System.out.println("ss : " + ss);
                list1.remove(ss);
                a++;
            }
        }
        b -= a;
        if(b == 0) answer = 1;
        else answer = a / b;
        System.out.println("a : " + a + ", b : " + b);
        return (int)(answer * 65536.0);
    }
}