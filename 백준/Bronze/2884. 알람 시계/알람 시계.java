import java.io.IOException;
import java.util.*;
class Main {

    public static void main(String []args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        if(m - 45 < 0) {
            m = m - 45 + 60;
            if(h > 0) {
                h --;
            } else {
                h = h - 1 + 24;
            }
        } else {
            m = m - 45;
        }
        System.out.println(h + " " + m);
    }
}