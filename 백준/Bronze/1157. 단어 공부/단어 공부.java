import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

class Main {

    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
        String input = br.readLine();
        input = input.toUpperCase();
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : input.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int max = 0;
        String s = "";
        for(Character c : map.keySet()) {
            if(map.get(c) > max) {
                max = map.get(c);
                s = String.valueOf(c);
            } else if(map.get(c) == max) {
                s = "?";
            }
        }
        System.out.println(s);
    }
}