import java.util.*;
public class Main {
    static int testcase,node,v;
    static int arr[];
    static List<Integer> list[];
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        testcase = scan.nextInt();
        while(testcase-- > 0){
            node = scan.nextInt();
            v = scan.nextInt();
            list = new ArrayList[node+1];
            for(int i = 1; i < node+1; i++){
                list[i] = new ArrayList<>();
            }
            for(int i = 0; i < v; i++) {
                int a = scan.nextInt();
                int b = scan.nextInt();
                list[a].add(b);
                list[b].add(a);
            }
            arr = new int[node+1];
            bfs(1);
        }
    }
    public static void bfs(int x){
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i < node+1; i++){
            if(arr[i] == 0){
                arr[i] = 1;
                queue.offer(i);
            }
            while(!queue.isEmpty()){
                int now = queue.poll();
                for(int j : list[now]){
                    if(arr[j] == arr[now]) {
                        System.out.println("NO");
                        return;
                    }
                    if(arr[j] == 0){
                        queue.offer(j);
                        if(arr[now] == 1){
                            arr[j] = 2;
                        }else
                            arr[j] = 1;
                    }
                }
            }
        }
        System.out.println("YES");
    }
}