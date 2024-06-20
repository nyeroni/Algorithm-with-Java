import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); // distance
		StringTokenizer st2 = new StringTokenizer(br.readLine(), " "); // price

		long sp = Long.parseLong(st2.nextToken()); // smallerPrice
		long sum = 0;
		long price, distance;
		while (st.hasMoreTokens()) {
			distance = Long.parseLong(st.nextToken());
			sum += sp * distance;

			price = Long.parseLong(st2.nextToken());
			if (sp > price) {
				sp = price;
			}
		}
		System.out.println(sum);
	}
}
