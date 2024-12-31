import java.util.*;
import java.io.*;

public class Main {
    static int checkSecret;
    static int []checkArr;
    static int []myArr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char [] dna = new char[N];
        dna = br.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());

        checkArr = new int[4];
        myArr = new int[4];
        checkSecret = 0;

        for(int k=0; k<4; k++) {
            checkArr[k] = Integer.parseInt(st.nextToken());
            if(checkArr[k] == 0) {
                checkSecret++;
            }
        }

        int result = 0;

        for(int i=0; i<M; i++) {
            Add(dna[i]);
        }
        if(checkSecret == 4) {
            result ++;
        }
        for (int i=M; i<N; i++) {
            int j = i-M;
            Add(dna[i]);
            Remove(dna[j]);
            if(checkSecret == 4) {
                result ++;
            }
        }
        System.out.println(result);
        br.close();
    }
    private static void Add(char c) {
        switch (c) {
            case 'A':
                myArr[0]++;
                if(myArr[0] == checkArr[0]) {
                    checkSecret++;
                }
                break;
            case 'C':
                myArr[1]++;
                if(myArr[1] == checkArr[1]) {
                    checkSecret++;
                }
                break;
            case 'G':
                myArr[2]++;
                if(myArr[2] == checkArr[2]) {
                    checkSecret++;
                }
                break;
            case 'T':
                myArr[3]++;
                if(myArr[3] == checkArr[3]) {
                    checkSecret++;
                }
                break;
        }
    }
    private static void Remove(char c) {
        switch (c) {
            case 'A':
                if (myArr[0] == checkArr[0]) {
                    checkSecret--;
                }
                myArr[0]--;
                break;
            case 'C':
                if (myArr[1] == checkArr[1]) {
                    checkSecret--;
                }
                myArr[1]--;
                break;
            case 'G':
                if (myArr[2] == checkArr[2]) {
                    checkSecret--;
                }
                myArr[2]--;
                break;
            case 'T':
                if (myArr[3] == checkArr[3]) {
                    checkSecret--;
                }
                myArr[3]--;
                break;
        }
    }
}