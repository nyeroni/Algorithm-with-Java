import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        // 입력된 수식을 읽어옴
        String example = scanner.nextLine();

        // '-'를 기준으로 수식을 분리
        String[] str = example.split("-");

        // 결과를 저장할 변수
        int sum = 0;

        // '-'로 나눈 각 부분을 처리
        for (int i = 0; i < str.length; i++) {
            if (i == 0) {
                // 첫 번째 덩어리는 무조건 더해줌
                sum += mySum(str[i]);
            } else {
                // 이후 덩어리는 모두 빼줌
                sum -= mySum(str[i]);
            }
        }

        // 최종 결과 출력
        System.out.println(sum);
    }

    // 문자열 덩어리에서 '+'로 나누어 합을 계산하는 함수
    public static int mySum(String a) {
        int sum = 0;

        // '+'를 기준으로 숫자를 분리
        String[] tmp = a.split("[+]");

        // 각 숫자를 더해줌
        for (int i = 0; i < tmp.length; i++) {
            sum += Integer.parseInt(tmp[i]);
        }

        return sum; // 계산된 합 반환
    }
}