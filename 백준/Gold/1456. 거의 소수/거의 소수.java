import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력 받기
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong(); // 범위의 시작 값
        long B = sc.nextLong(); // 범위의 끝 값

        // 10,000,000까지의 소수를 저장할 배열
        long[] arr = new long[10000001];
        for (int i = 2; i < arr.length; i++) {
            arr[i] = i; // 초기화: 인덱스 값을 저장
        }

        // 에라토스테네스의 체로 소수 판별
        for (int i = 2; i <= Math.sqrt(arr.length); i++) {
            if (arr[i] == 0) continue; // 이미 지워진 숫자는 스킵
            for (int j = i + i; j < arr.length; j += i) {
                arr[j] = 0; // 소수의 배수는 지움
            }
        }

        // 거의 소수를 카운트하는 변수
        int count = 0;

        // 소수의 N제곱 값을 구하고 카운트
        for (int i = 2; i < 10000001; i++) {
            if (arr[i] != 0) { // 소수인 경우만 처리
                long tmp = arr[i]; // 소수의 N제곱을 계산할 변수
                while ((double) arr[i] <= (double) B / (double) tmp) { // tmp가 B를 초과하면 종료
                    if ((double) arr[i] >= (double) A / (double) tmp) { // tmp가 A 이상이면 카운트
                        count++;
                    }
                    tmp *= arr[i]; // tmp를 소수로 계속 곱함 (N제곱 계산)
                }
            }
        }

        // 결과 출력
        System.out.println(count);
    }
}