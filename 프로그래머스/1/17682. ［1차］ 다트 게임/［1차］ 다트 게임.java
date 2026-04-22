import java.util.*;
class Solution {
    public int solution(String dartResult) {
        // S = 1, D = 2, T = 3
        // * -> 2배
        // # -> * -1
        StringBuilder sb = new StringBuilder();
        int i = 0;
        List<Integer> list = new ArrayList<>();
        int answer = 0;
        while(i < dartResult.length()) {
            char c = dartResult.charAt(i);
            if(c >= '0' && c <= '9') {
                sb.append("" + c);
            }
            else {
                if(c == 'S') {
                    int num = Integer.parseInt(sb.toString());
                    list.add(num);
                } else if(c == 'D') {
                    int num = Integer.parseInt(sb.toString());
                    list.add((int)Math.pow(num, 2));
                } else if(c == 'T') {
                    int num = Integer.parseInt(sb.toString());
                    list.add((int)Math.pow(num, 3));
                } else if(c == '*') {
                    if(list.size() > 1) {
                        int a = list.get(list.size() - 2) * 2;
                        int b = list.get(list.size() - 1) * 2;
                        list.remove(list.size() - 2);
                        list.remove(list.size() - 1);
                        list.add(a);
                        list.add(b);
                    } else {
                        int a = list.get(list.size()-1) * 2;
                        list.remove(list.size()-1);
                        list.add(a);
                    }
                } else if(c == '#') {
                    int a = list.get(list.size()-1) * (-1);
                    list.remove(list.size()-1);
                    list.add(a);
                }
                sb = new StringBuilder();
            }
            i++;
        }
        for(int l : list) {
            answer += l;
        }
        return answer;
    }
}