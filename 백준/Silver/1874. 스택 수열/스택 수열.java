import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack =new Stack<>();
        int last = 0;
        for(int i=0; i<N;i++){
            int n = Integer.parseInt(br.readLine());
            if(n>last){
                for(int j=last+1 ; j<=n; j++){
                    stack.push(j);
                    sb.append("+\n");
                }
                last = n;
            }
            if(stack.get(stack.size()-1)==n){
                stack.pop();
                sb.append("-\n");
            }
        }
        if(stack.size()>0){
            System.out.println("NO");
        }
        else {
            System.out.println(sb);
        }

    }
}