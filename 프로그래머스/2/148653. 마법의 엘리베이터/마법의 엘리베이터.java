class Solution {
    public int solution(int storey) {
        // -1, +1, -10, +10, -100, +100 등 절댓값이 10^c 형태의 정수
        // 버튼을 누르면 더한 결과로 이동 -> 더한 결과가 0보다 작으면 움직이지 않음 (0층부터)
        // 16층에서 0층으로 가려면 
        // -1 버튼 6번 -10버튼 1번 = 7번 
        // -10 버튼 2번 +1버튼 4번 = 6번
        // 입력 : 현재 층수 , 출력 : 마법의 돌 최소 개수! 
        int answer = 0;
        // 만약에 5까지는 그냥 빼기 
        // 5보다 크다면 한번 더 빼고 더하기 수법으로
        
        // 2554 = 2000을 뺄지 3000을 뺄지 선택하기 
        // -> 3000을 빼버리면 3000-2554 = 446
        // 400을 더해야하네? 46이 남음 50 더하기 4더하기 (6이기 때문에..)

        while(storey > 0) {
            int digit = storey % 10;
            System.out.println("digit : " + digit);
            storey = storey / 10;
            System.out.println("new storey : " + storey);
            if(digit < 5) {
                answer += digit;
            } else if(digit > 5) {
                answer += (10 - digit);
                storey += 1;
            } else {
                answer += 5;
                int nextdisit = storey%10;
                if(nextdisit >= 5) {
                    storey += 1;
                } 
            }
        }
        return answer;
    }
}