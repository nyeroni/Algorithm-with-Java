class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        // t초동안 붕대 감음 -> 1초마다 x 체력 회복! 
        // t초 연속 붕대 감는다면 y만큼 추가 회복
        // 최대 체력을 넘어서는건 안됨
        // 기술 쓰다가 공격받으면 기술 취소 -> 순간에는 회복 불가
        // 기술이 취소당하거나 끝나면 바로 붕대감기
        // 시간도 0으로 초기화됨
        // 체력이 0이하가 되면 죽음
        // bandage : 시전 시간, 초당 회복량, 추가 회복량
        // attacks : 공격시간, 피해량
        int idx = 0;
        int time = 0;
        int count = 0;
        int max = health;
        while(health > 0 && idx < attacks.length) {
            time ++;            
            // System.out.println("time : " + time + ", attacks[idx][0] : " + attacks[idx][0] + ", count : " + count);

            if(health <= 0) return -1;
            if(attacks[idx][0] == time) {
                health -= attacks[idx][1];
                count = 0;
                idx ++;
            }
            else {
                if(count < bandage[0]-1) {
                    count ++;
                    health += bandage[1];
                }
                else if(count == bandage[0]-1) {
                    count = 0;
                    health += (bandage[2] + bandage[1]);
                }
                if(health > max) {
                    health = max;
                }
            }
            // System.out.println("health : " + health);
        }
        if(health <= 0) return -1;
        return health;
    }
}