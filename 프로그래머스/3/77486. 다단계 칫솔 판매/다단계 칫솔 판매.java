import java.util.*;

class Solution {
    static class Member{
        String parent;
        String name;
        List<String> child = new ArrayList<>();
        int money = 0;
        
        Member(String name) {
            this.name = name;
        }
        void addParent(String name) {
            this.parent = name;
        }
        void addChild(String name) {
            child.add(name);
        }
        void updateMoney(int money) {
            this.money += money;
        }
    }
    static Map<String, Member> map = new HashMap<>();
    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        // int[] answer = new int[enroll.length+1];
        // 모든 판매원은 칫솔 판매의 이익의 10%를 자신을 조직에 참여시킨 추천인에게 배분 -> 나머지 90 내거
        //이익은 개당 100원 -> 10%를 계산한 금액이 1원 미만인 경우 분배 x 본인이 가짐
        // Map<String, Member> map = new HashMap<>();
        // List<Member> list = new ArrayList<>();
        map.put("-", new Member("-"));

        for(int i=0; i<referral.length; i++) {
            map.put(enroll[i], new Member(enroll[i]));
            map.get(enroll[i]).addParent(referral[i]);
            map.get(referral[i]).addChild(enroll[i]);
        }
        for(int i=0; i<seller.length; i++) {
            String s = seller[i];
            Member member = map.get(s);
            calculate(amount[i] * 100, s);
        }
        List<Integer> answer = new ArrayList<>();
        for(String e : enroll) {
           answer.add(map.get(e).money);
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
    public void calculate(int amount, String name) {
        if(name.equals("-")) return;
        if(amount < 1) return;
        Member member = map.get(name);
        int a = (int)(amount * 0.1);
        int b = amount - a;
        // System.out.println("====name : " + name + ", amount : " + amount + ", a : "  + a + ", b : " + b);
        member.updateMoney(b);
        calculate(a, member.parent);
    }
}