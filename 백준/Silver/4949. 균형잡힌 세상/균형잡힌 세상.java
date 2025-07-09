import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class Main {

    public static void main(String []args) throws IOException {
        Stack<String> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String str = br.readLine();
            stack.clear();
//            System.out.println("str : " + str);
            if(str.equals(".")) {
                break;
            }
            boolean flag = true;
            for(int i=0;i<str.length();i++) {
                char c = str.charAt(i);

                if(c == '(' || c == '[') {
                    stack.push(String.valueOf(c));
                } else if(c == ')') {
                    if(stack.isEmpty() || !stack.peek().equals("(")) {
                        flag = false;
                        break;
                    }
                    stack.pop();
                } else if(c == ']') {
                    if(stack.isEmpty() || !stack.peek().equals("[")) {
                        flag = false;
                        break;
                    }
                    stack.pop();
                }
            }
            if (stack.isEmpty() && flag) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}