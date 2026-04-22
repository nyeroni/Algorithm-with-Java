class Solution {
    public int solution(String skill, String[] skill_trees) {
        int count = 0;
        int answer = 0;
        for(String s : skill_trees) {
            count = 0;
            boolean flag = false;
            for(char c : s.toCharArray()) {
                if(count >= skill.length()) break;
                if(c == skill.charAt(count)) {
                    count ++;
                } else if(skill.indexOf(c) > count && skill.charAt(count) != c) {
                    flag = true;
                    break;
                }
            }
            System.out.println("count : " + count );
            if(!flag) answer ++;
        }
        return answer;
    }
}