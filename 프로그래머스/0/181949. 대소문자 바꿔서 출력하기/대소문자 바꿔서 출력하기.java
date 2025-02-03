import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String newStr = "";
        for(int i=0; i<a.length(); i++) {
            if(a.charAt(i) >= 'a' && a.charAt(i) <= 'z') {
                newStr += (char) (a.charAt(i) - 'a' + 'A');
            }
            else if(a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') {
                newStr += (char)(a.charAt(i) - 'A' + 'a');
            }
        }
        System.out.println(newStr);
    }
}