import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

class Main {

    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();
        int nA = changeNum(a);
        int nB = changeNum(b);
        if(nA > nB) {
            System.out.println(nA);
            return;
        }
        System.out.println(nB);
    }
    static int changeNum(String s) {
        String newNum = "";
        for(int i=s.length()-1; i>=0; i--) {
            newNum += s.charAt(i);
        }
        return Integer.parseInt(newNum);
    }
}