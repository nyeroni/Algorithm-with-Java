import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


class Main {

    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int time = Integer.parseInt(st.nextToken());
        minute = minute + time;

        while(true) {
            if(minute < 60) break;
            minute -= 60;
            hour ++;
            if(hour >= 24) hour -=24;
        }
        System.out.println(hour + " " + minute);
    }
}