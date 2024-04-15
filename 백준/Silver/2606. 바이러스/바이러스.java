import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int map[][];		
	static boolean visit[];
	static int n, m, v;
	static int count = 0;
	
	public static int bfs(int i) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(i);
		visit[i] = true;
		while(!q.isEmpty()) {
			int temp = q.poll();
			
			for(int k=1; k<=n; k++) {
				if(map[temp][k] == 1 && visit[k] == false) {
					q.offer(k);
					visit[k] = true;
					count ++;
				}
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();	
		m = scan.nextInt();	
		v = 1;	
		map = new int[n+1][n+1];	
		visit = new boolean[n+1];	
		
		for(int i=0; i<m; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			map[a][b] = map[b][a]= 1;
		}
		System.out.println(bfs(1));
		scan.close();
	}
}