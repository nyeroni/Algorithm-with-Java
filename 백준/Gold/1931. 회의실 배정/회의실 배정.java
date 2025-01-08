import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int[][] A = new int[N][2]; 

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            A[i][0] = Integer.parseInt(st.nextToken());  // 시작 시간
            A[i][1] = Integer.parseInt(st.nextToken());  // 종료 시간
        }

        // 종료 시간을 기준으로 오름차순 정렬 (같은 경우 시작 시간을 기준으로 정렬)
        Arrays.sort(A, new Comparator<int[]>() {
            @Override
            public int compare(int[] S, int[] E) {
                if (S[1] == E[1]) {  // 종료 시간이 같으면
                    return S[0] - E[0];  // 시작 시간을 기준으로 오름차순 정렬
                }
                return S[1] - E[1];  // 종료 시간을 기준으로 오름차순 정렬
            }
        });

        // 그리디 알고리즘으로 회의 배정
        int count = 0;  // 최대 배정할 수 있는 회의 수
        int end = -1;   // 이전 회의의 종료 시간 (초기값: -1)

        for (int i = 0; i < N; i++) {
            if (A[i][0] >= end) {  // 현재 회의의 시작 시간이 이전 회의의 종료 시간 이후라면
                end = A[i][1];     // 종료 시간을 업데이트
                count++;           // 회의 배정
            }
        }

        System.out.println(count);
    }
}
