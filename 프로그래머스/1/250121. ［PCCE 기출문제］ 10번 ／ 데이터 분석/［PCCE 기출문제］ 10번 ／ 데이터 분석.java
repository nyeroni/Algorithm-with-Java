import java.util.*;

class Solution {
    static int s = 0;
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        
        int num = 0;
        if(ext.equals("code")) {
            num = 0; 
        } else if(ext.equals("date")) {
            num = 1;
        } else if(ext.equals("maximum")) {
            num = 2;
        } else if(ext.equals("remain")) {
            num = 3;
        }
        if(sort_by.equals("code")) {
            s = 0;
        } else if(sort_by.equals("date")) {
            s = 1;
        } else if(sort_by.equals("maximum")) {
            s = 2;
        } else if(sort_by.equals("remain")) {
            s = 3;
        }
        List<int[]> list = new ArrayList<>();
        for(int [] d : data)  {
            int code = d[0];
            int date = d[1];
            int maximum = d[2];
            int remain = d[3];
            if(d[num] < val_ext) {
                list.add(new int[]{code, date, maximum, remain});
            }
        }
        
        Collections.sort(list, new Comparator<>() {
            public int compare(int[] a, int[] b) {
                System.out.println("a[0] : " + a[3] + ", b[0] : " + b[3]);
                return a[s] - b[s];
            }
        });
        
        int[][] answer = new int[list.size()][4];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}