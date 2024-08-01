import java.util.*;

public class Main
{
    static int white = 0;
	static int blue = 0; 
	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	  
	    int n = sc.nextInt();
	    int arr[][] = new int[n][n];
	    
	    for(int i = 0; i<n; i++) {
	        for(int j = 0; j<n; j++) {
	            arr[i][j] = sc.nextInt();
	        }
	        sc.nextLine();
	    }
	   
	    quad(arr);
	    
	    System.out.println(white);
	    System.out.println(blue);
	}
	
	 static void quad(int[][] arr) {
	    int n = arr[0].length;
	    
	    if(n == 1 || isAllColorSame(arr)) {
	        checkColor(arr[0][0]);
	        return;
	    }
	   
	    int divide = n/2;
	    
        int [][] arr1 = new int[divide][divide];
        int [][] arr2 = new int[divide][divide];
        int [][] arr3 = new int[divide][divide];
        int [][] arr4 = new int[divide][divide];
        
      
	    for(int i = 0; i<divide; i++) {
	       for(int j = 0; j<divide; j++) {
	           arr1[i][j] = arr[i][j];
	           arr2[i][j] = arr[i+divide][j];
	           arr3[i][j] = arr[i][j+divide];
	           arr4[i][j] = arr[i+divide][j+divide];
	       }
	    }
	    
	    quad(arr1);
	    quad(arr2);
	    quad(arr3);
	    quad(arr4);
	}
	
	
	 static boolean isAllColorSame(int[][] arr) {
	    int color = arr[0][0];
	    int n = arr[0].length;
	    
	    for(int i = 0; i<n; i++) {
	        for(int j = 0; j<n; j++) {
	           if(color != arr[i][j]) {
	               return false;
	           }
	        }
	    }
	    return true;
	}
	
	static void checkColor(int color) {
       if(color == 0) {
            white++;
        } else {
            blue++;
        }
	}
}