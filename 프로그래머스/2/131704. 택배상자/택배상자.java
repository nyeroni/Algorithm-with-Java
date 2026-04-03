import java.util.*;
class Solution {
    public int solution(int[] order) {
        // 1~n번상자까지 번호가 증가하는 순서대로 일렬로 놓여서 영재에게 전달
        // 컨테이너 벨트는 한방향으로만 진행
        // 벨트에 놓인 순서대로(1번 상자부터) 상자를 내림
        // 순서대로 내려서 트럭에 실으면 택배 기사님이 배달하는 순서와 택배 상자가 실려있는 순서가 맞지 않아 배달에 차질
        // 택배 기사가 미리 알려준 순서대로 실어야함
        // 컨테이너 벨트의 맨 앞에 놓인 상자가 현재 트럭에 실어야 하는 순서가 아니라면 -> 그 상자를 트럭에 실을 순서가 될 때까지 잠시 다른 곳에 보관
        // 보조 컨테이너 벨트를 추가로 설치함 -> 마지막에 보관한 상자부터 꺼냄
        // 보조 컨테이너 벨트를 이용해도 기사님이 원하는 순서대로 상자를 싣지 못한다면 더이상 싣지 않음
        // 1~5 -> 4, 3, 1, 2, 5 순서로 실어야함
        // 1, 2, 3 보조로 -> 4 싣고 -> 보조에서 3 싣고 1을 못빼서 2개로 끝!
        int now = 1;
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int target : order) {
            while(now <= target) {
                stack.push(now);
                now ++;
            }
            if(!stack.isEmpty() && stack.peek() == target) {
                answer ++;
                stack.pop();
            } else break;
        }
        return answer;
    }
}