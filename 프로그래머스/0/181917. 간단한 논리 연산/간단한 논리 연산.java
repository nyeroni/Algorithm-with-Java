class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {        
        return and(or(x1, x2), or(x3, x4));
    }
    public boolean or(boolean a, boolean b) {
        if(a || b) {
            return true;
        } else {
            return false;
        } 
    } 
    public boolean and(boolean a, boolean b) {
        if(a && b) {
            return true;
        } else {
            return false;
        } 
    }
}