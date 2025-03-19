class Solution {
    int answer = 0;
    public int solution(String skill, String[] skill_trees) {
        for(int i=0; i<skill_trees.length; i++) {
            if(isPossible(skill, skill_trees[i])) {
                answer ++;
            } 
        }
        return answer;
    }
    public boolean isPossible(String skill, String tree) {
        String word = "";
        for(int i=0; i<tree.length(); i++) {
            String s = String.valueOf(tree.charAt(i));
            if(skill.contains(s)){
                word += s;
            }
        }
        int idx = skill.indexOf(word);
        if(idx == 0) {
            return true;
        } return false;
    }
}