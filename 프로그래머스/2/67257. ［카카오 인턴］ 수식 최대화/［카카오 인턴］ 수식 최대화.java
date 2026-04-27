import java.util.*;

class Solution {
    public long solution(String expression) {
       // 숫자들과 3가지 연산문자(+, -, *)만으로 이루어짐
        // 우선순위 자유롭게 재정의 -> 가장 큰 숫자!
        // 다 다른 우선순위(동일한 순위 x)
        // 음수라면 절대값 -> 가장 큰 숫자 ! 이게 상금임
        // 100 - (200 * 300) - (500 + 20) = 100 - 60000 - 520 = |60420|
        List<String> tmp = new ArrayList<>();
        int idx = 0;
        StringBuilder sb = new StringBuilder();
        for(char c : expression.toCharArray()) {
            if(c >= '0' && c <= '9') {
                sb.append("" + c);
            } else {
                tmp.add(sb.toString());
                sb = new StringBuilder();
                tmp.add("" + c);
            }
        }
        tmp.add(sb.toString());
        // for(String s : tmp) {
        //     System.out.println("s : " + s);
        // }
        // System.out.println("========");
        // tmp.add(0, "hi");
        // tmp.remove(1);
        // tmp.remove(1);
        // tmp.remove(1);
        // for(String s : tmp) {
        //     System.out.println("s : " + s);
        // }
        long max = calculate("+", "-", "*", tmp);
        max = Math.max(calculate("+", "*", "-", tmp), max);
        max = Math.max(calculate("-", "*", "+", tmp), max);
        max = Math.max(calculate("-", "+", "*", tmp), max);
        max = Math.max(calculate("*", "+", "-", tmp), max);
        max = Math.max(calculate("*", "-", "+", tmp), max);
        return max;
    }
    public long calculate(String a, String b, String c, List<String> tmp) {
        List<String> list = new ArrayList<>(tmp);
    
        list = calcu(a, list);
        list = calcu(b, list);
        list = calcu(c, list);
       return Math.abs(Long.parseLong(list.get(0)));
    }
    public List<String> calcu(String a, List<String> list) {
        for(int i=1; i<list.size()-1; i++) {
            
            if(list.get(i).equals(a)) {
                long result = cal(list.get(i), Long.parseLong(list.get(i-1)), Long.parseLong(list.get(i+1)));
                list.add(i-1, "" + result);
                list.remove(i);
                list.remove(i);
                list.remove(i);
                i--;
            }
        }
        return list;
    }
    public long cal(String a, long num1, long num2) {
        if(a.equals("+")) return num1 + num2;
        else if(a.equals("*")) return num1 * num2;
        return num1-num2;
    }
}