class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        int[][] arr = new int[rows+1][columns+1];
        int k=1;
        for(int i=1; i<=rows; i++) {
            for(int j=1; j<=columns; j++) {
                arr[i][j] = k++;      
            }   
        }
        for(int i=0; i<queries.length; i++) {
            int x1 = queries[i][0];
            int y1 = queries[i][1];
            int x2 = queries[i][2];
            int y2 = queries[i][3];
            
            int startNum = arr[x1][y1];
            int endNum = arr[x2][y2];
            
            int nowx = x1;
            int nowy = y1+1;
            int num = startNum;
            int min = startNum;
            while(true) {
                if(min > num) min = num;
                if(nowx == x1 && nowy == y1)  {
                    int changeNum = startNum;
                    arr[nowx][nowy] = num;
                    break;
                }
                if(nowx >= x1 && nowx <= x2 && nowy >= y1 && nowy <= y2) {
                    int changeNum = arr[nowx][nowy];
                    arr[nowx][nowy] = num;
                    num = changeNum;
                }
                if(nowx == x1 && nowy <= y2) {
                   if(nowy == y2) {
                        nowx ++;
                    }
                    else nowy ++;
                }
                else if(nowy == y2 && nowx <= x2) {
                    if(nowx == x2) {
                        nowy --;
                    } else nowx ++;
                }
                else if(nowy >= y1) {
                    if(nowy == y1) {
                       nowx --; 
                    }
                    else nowy --;
                }
            }
            answer[i] = min;
        }
        return answer;
    }
}