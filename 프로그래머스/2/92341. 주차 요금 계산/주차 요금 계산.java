import java.util.*;
class Solution {
    public int[] solution(int[] fees, String[] records) {
        List<Integer> list = new ArrayList<>();
        Map<String, String> map = new LinkedHashMap<>();
        Map<String, Integer> timeMap = new HashMap<>();
        for(int i=0; i<records.length; i++) {
            String[] tmp = records[i].split(" ");
            if(!map.containsKey(tmp[1])) {
                if(tmp[2].equals("IN")) {
                    map.put(tmp[1], tmp[0]);
                }
            }
            else {
                if(tmp[2].equals("OUT")) {
                    String in = map.get(tmp[1]);
                    map.remove(tmp[1]);
                    String []hm1 = in.split(":");
                    int h1 = Integer.parseInt(hm1[0]);
                    int m1 = Integer.parseInt(hm1[1]);
                    String []hm2 = tmp[0].split(":");
                    int h2 = Integer.parseInt(hm2[0]);
                    int m2 = Integer.parseInt(hm2[1]);
                    int h=0, m=0;
                    if(h2>h1) {
                        h = h2 - h1;
                    } 
                    if(m2 > m1) {
                        m = m2 - m1;
                    } else {
                        m = m2 + 60 - m1;
                        h--;
                    }
                    m += h * 60;
                    if(!timeMap.containsKey(tmp[1])) {
                        timeMap.put(tmp[1], m);
                    }
                    else {
                            timeMap.replace(tmp[1], timeMap.get(tmp[1]) + m);

                        }
                    }
            }
        }

        for(String str : map.keySet()) {
            String s = map.get(str);
            String []hm1 = s.split(":");
            int h1 = Integer.parseInt(hm1[0]);
            int m1 = Integer.parseInt(hm1[1]);
            if(h1==23 && m1 == 59) continue;
            int h2 = 23;
            int m2 = 59;
            
            int h=0, m=0;
            if(h2>h1) {
                h = h2 - h1;
            } 
            if(m2 > m1) {
                m = m2 - m1;
            } else {
                m = m2 + 60 - m1;
                h--;
            }
            m += h * 60;
            System.out.println("m :" + m);
            if(!timeMap.containsKey(str)) {
                timeMap.put(str, m);
            }
            else {
                timeMap.replace(str, timeMap.get(str) + m);
            }
        }
        System.out.println("map : " + timeMap.size());
        List<String> keyList = new ArrayList<>(timeMap.keySet());
        System.out.println("keyList : " + keyList.size());
        Collections.sort(keyList);
          for(String s : keyList) {
                int m = timeMap.get(s);
                int fee = calculate(fees, timeMap.get(s));
                list.add(fee);
            }
        return list.stream().mapToInt(i->i).toArray();
    }
    private int calculate(int[] fees, int m) {
        int fee = fees[1];
        if(m > fees[0]) {
            m = m-fees[0];
            double count = Math.ceil(((double)m / (double)fees[2]));
            fee += (int)(count * fees[3]);
        }
        return fee;
    }
}