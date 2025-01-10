import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        long min = sc.nextLong();
        long max = sc.nextLong();

        // 제곱수의 배수를 마킹할 배열 선언
        boolean[] check = new boolean[(int)(max - min + 1)];

        // 2부터 시작해서 제곱수로 나누어지는 값을 마킹
        for(long i=2; i*i <= max; i++){
            long pow = i*i;
            long start_index = min/pow;

            // 시작 위치 계산
            if(min % pow != 0) {
                start_index ++;
            }

            // 제곱수 배수들 마킹
            for(long j = start_index; pow * j <= max; j++){
                check[(int) ((j * pow) - min)] = true;
            }
        }

        // 제곱ㄴㄴ수의 개수 세기
        int count = 0;
        for(int i=0; i<=max-min; i++) {
            if(!check[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}