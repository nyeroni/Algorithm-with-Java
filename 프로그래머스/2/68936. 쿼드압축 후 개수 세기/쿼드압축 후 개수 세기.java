class Solution {
    static int one = 0, zero = 0;
    static boolean[][] flag;
    public int[] solution(int[][] arr) {
        compress(arr, 0, 0, arr.length);
        return new int[]{zero, one};
    }
    public void compress(int[][] arr, int row, int col, int size) {
        if(isSame(arr, row, col, size)) {
            if(arr[row][col] == 0) zero ++;
            else if(arr[row][col] == 1) one ++;
            return;
        }
        int half = size/2;
        compress(arr, row, col, half);
        compress(arr, row, col + half, half);
        compress(arr, row + half, col, half);
        compress(arr, row + half, col + half, half);
    }
    public boolean isSame(int[][] arr, int row, int col, int size) {
        int value = arr[row][col];
        for(int i=row; i<row + size; i++) {
            for(int j=col; j<col + size; j++) {
                if(value != arr[i][j]) return false;
            }
        }
        return true;
    }
}