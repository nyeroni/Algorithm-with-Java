import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        // J(A, B) : 두 집합의 교집합 크기 / 두 집합의 합집합 크기
        // A나 B가 0인 경우 1
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        List<String> s1 = new ArrayList<>();
        List<String> s2 = new ArrayList<>();
        for(int i=0; i<str1.length()-1; i++) {
            char c1 = str1.charAt(i);
            char c2 = str1.charAt(i+1);
            if(c1 < 'A' || c1 > 'Z' || c2 < 'A' || c2 > 'Z') continue;
            s1.add(String.valueOf("" + c1 + c2));            
        }
        for(int i=0; i<str2.length()-1; i++) {
            char c1 = str2.charAt(i);
            char c2 = str2.charAt(i+1);
            if(c1 < 'A' || c1 > 'Z' || c2 < 'A' || c2 > 'Z') continue;
            s2.add(String.valueOf("" + c1 + c2));            
        }
        if(s1.size() == 0 && s2.size() == 0) return 65536;
        // 교집합 : 
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        for(String s : s2) {
            list2.add(s);
        }
        for(int i=0; i<s1.size(); i++) {
            if(s2.contains(s1.get(i))) {
                s2.remove(s1.get(i));
                list1.add(s1.get(i));
            } else {
                list2.add(s1.get(i));
            }
        }
        return (int) (((double) list1.size() / (double) list2.size()) * 65536);
    }
}