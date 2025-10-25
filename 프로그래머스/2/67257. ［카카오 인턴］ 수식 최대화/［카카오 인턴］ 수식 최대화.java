import java.util.*;

class Solution {
    static List<Long> numbers = new ArrayList<>();
    static List<String> operators = new ArrayList<>();
    static String[][] priority = {
        {"+", "-", "*"},
        {"+", "*", "-"},
        {"-", "+", "*"},
        {"-", "*", "+"},
        {"*", "+", "-"},
        {"*", "-", "+"}
    };
    public long solution(String expression) {
        long answer = 0;
        parse(expression);
        for(String[] ops : priority) {
            answer = Math.max(answer, Math.abs(calc(ops)));
        }
        return answer;
    }
    private void parse(String exp) {
        numbers.clear();
        operators.clear();
        String num = "";
        for(char c : exp.toCharArray()) {
            if(c == '+' || c == '-' || c == '*') {
                numbers.add(Long.parseLong(num));
                num = "";
                operators.add(Character.toString(c));
            } else num += c;
        }
        numbers.add(Long.parseLong(num));
    }
    private long calc(String[] ops) {
        List<Long> nums = new ArrayList<>(numbers);
        List<String> opsList = new ArrayList<>(operators);
        
        for(String op : ops) {
            for(int i=0; i<opsList.size();) {
                if(opsList.get(i).equals(op)) {
                    long a = nums.remove(i);
                    long b = nums.remove(i);
                    long res = operate(a, b, op);
                    nums.add(i, res);
                    opsList.remove(i);
                } else i++;
            }
        }
        return nums.get(0);
    }
    private long operate(long a, long b, String op) {
        switch(op) {
            case "+": return a+b;
            case "-": return a-b;
            case "*": return a*b;
        }
        return 0;
    }
}