import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    private static int[] arr = {0, 0, 0, 0};
    public static void main(String [] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        String str = br.readLine().toString();

        st = new StringTokenizer(br.readLine());

        int [] checkArr = new int[4];

        for (int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
        }
        int cnt = 0;

        for(int i=0; i<P; i++){
            add(str.charAt(i));
        }
        if(isSuccess(arr, checkArr)){
            cnt++;
        }
        for(int i=P; i<S; i++){
            remove(str.charAt(i-P));
            add(str.charAt(i));
            if(isSuccess(arr, checkArr)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    private static void add(char c){
        if(c =='A'){
           arr[0] ++;
        }
        else if(c =='C'){
            arr[1] ++;
        }
        else if(c =='G'){
            arr[2] ++;
        }
        else if(c =='T'){
            arr[3] ++;
        }
    }
    private static void remove(char c){
        if(c =='A'){
            arr[0] --;
        }
        else if(c =='C'){
            arr[1] --;
        }
        else if(c =='G'){
            arr[2] --;
        }
        else if(c =='T'){
            arr[3] --;
        }
    }
    private static boolean isSuccess(int []arr, int[]checkArr){
        if(checkArr[0]<=arr[0] && checkArr[1]<=arr[1] && checkArr[2]<=arr[2] && checkArr[3]<=arr[3]  ){
            return true;
        }
        return false;
    }
}