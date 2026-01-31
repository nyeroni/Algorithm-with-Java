import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


class Main {

    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(br.readLine().trim());
        int cnt = 0;
        for(int i=0; i<n; i++) {
            String input = br.readLine().trim();
            if(check(input)) cnt ++;
        }
        System.out.println(cnt);
    }
    static boolean check(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(i!= 0 && map.containsKey(c) && s.charAt(i-1) != c) {
                return false;
            }
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return true;
    }
}