class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        for(int i=0; i<arr.length-1; i++) {
            // System.out.println("arr[i] : " + arr[i] + ", arr[i+1] : " + arr[i+1] + ", arr[i] + arr[i+1] : " + (arr[i] + arr[i+1]));
            arr[i+1] = LCM(arr[i], arr[i+1]);
        }
        return arr[arr.length-1];
    }
    //최소 공배수
    private int LCM(int a, int b) {
        return (a * b) / GCD(a, b);
    }
    //최대 공약수
    private int GCD(int a, int b) {
        if(a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        for(int i=a; i>=1; i--) {
            if(a%i == 0 && b%i==0) {
                return i;
            }
        }
        return 1;
    }
}