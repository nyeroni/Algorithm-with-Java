import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        // 1️⃣ 입력받기
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();  // 소수의 최소 범위
        int N = sc.nextInt();  // 소수의 최대 범위

        // 2️⃣ 소수를 체크할 배열 생성
        int[] A = new int[N + 1];  // 배열 크기를 N+1로 설정
        for (int i = 2; i <= N; i++) {  
            A[i] = i;  // 초기화: 각 인덱스에 자신의 값 저장
        }

        // 3️⃣ 에라토스테네스의 체로 소수 판별
        for (int i = 2; i <= Math.sqrt(N); i++) {  
            if (A[i] == 0) continue;  // 이미 지워진 수는 건너뜀
            for (int j = i + i; j <= N; j += i) {  // 배수 제거
                A[j] = 0;  // 소수가 아니면 0으로 표시
            }
        }

        // 4️⃣ M 이상 N 이하의 소수 출력
        for (int i = M; i <= N; i++) {  
            if (A[i] != 0) {  // 배열 값이 0이 아니면 소수
                System.out.println(A[i]);  // 소수 출력
            }
        }
    }
}