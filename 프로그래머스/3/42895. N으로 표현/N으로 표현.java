import java.util.*;
class Solution {
    public int solution(int N, int number) {
        int answer = 0;
        Set<Integer>[] sets = new Set[9];
        for(int i=0; i<9; i++) {
            sets[i] = new HashSet<>();
        }
        sets[1].add(N);
        for(int i=2; i<9; i++) {    
            for(int j=1; j<i; j++) {
                for(int num1 : sets[j]) {
                    for(int num2 : sets[i-j]) {
                        sets[i].add(num1 + num2);
                        sets[i].add(num1 - num2);
                        sets[i].add(num1 * num2);
                        if(num2 != 0) {
                            sets[i].add(num1 / num2);
                        }
                    }
                }
            }
            int num = 0;
            for(int j=0; j<i; j++) {
                num = num * 10 + N;
            }
            sets[i].add(num);
        }
        for(int i=1; i<9; i++ ){
            if(sets[i].contains(number)) {
                return i;
            }
        }
        return -1;
    }
}