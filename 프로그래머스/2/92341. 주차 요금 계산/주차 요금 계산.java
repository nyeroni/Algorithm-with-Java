import java.util.*;
class Solution {
    public int[] solution(int[] fees, String[] records) {
        // fees[0] : fees[1] -> fees[2] : fees[3]
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, String> carIn = new HashMap<>();
        for(String record : records) {
            String []tmp = record.split(" ");
            int carNum = Integer.parseInt(tmp[1]);
            if(tmp[2].equals("IN")) {
                carIn.put(carNum, tmp[0]);
            } else if(tmp[2].equals("OUT")) {
                String[] inTime = carIn.get(carNum).split(":");
                carIn.remove(carNum);
                String[] outTime = tmp[0].split(":");
                int h, m;
                int oh = Integer.parseInt(outTime[0]);
                int om = Integer.parseInt(outTime[1]);
                int ih = Integer.parseInt(inTime[0]);
                int im = Integer.parseInt(inTime[1]);
                h = oh- ih;
                if(om - im < 0) {
                    m = om - im + 60;
                    h--;
                } else m = om - im;
                int totalMin = h * 60 + m;
                map.put(carNum, map.getOrDefault(carNum, 0) + totalMin);
            }
        }
        for(int name : carIn.keySet()) {
            System.out.println("name : " + name);
            String[] inTime = carIn.get(name).split(":");
            int h, m;
            int oh = 23;
            int om = 59;
            int ih = Integer.parseInt(inTime[0]);
            int im = Integer.parseInt(inTime[1]);
            h = oh- ih;
            if(om - im < 0) {
                m = om - im + 60;
                h--;
            } else m = om - im;
            int totalMin = h * 60 + m;
            map.put(name, map.getOrDefault(name, 0) + totalMin);
        }
        for(int m : map.keySet()) {
            int totalMin = map.get(m);
            int pay = 0;
            if(totalMin > fees[0]) {
               totalMin = totalMin - fees[0];
                pay += fees[1];
                if(totalMin % fees[2] == 0) {
                    pay += fees[3] * (totalMin / fees[2]);
                } else pay += fees[3] * (totalMin / fees[2] + 1);
            } else pay = fees[1];
            map.put(m, pay);
            System.out.println("pay : " + pay);
        }
       
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        int[] answer = new int[list.size()];
        int j=0;
        for(int k : list) {
            answer[j++] = map.get(k);
        }
        return answer;
    }
}