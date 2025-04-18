class Solution {
    public String solution(String new_id) {
        new_id = new_id.toLowerCase();
        new_id = new_id.replaceAll("[^[a-z0-9-_.]]", "");
        new_id = new_id.replaceAll("[.]{2,}", ".");
        new_id = new_id.replaceAll("^[.]", "");
        new_id = new_id.replaceAll("^\\s$", "a");
        new_id = new_id.replaceAll("^(.{15}).*", "$1");
        new_id = new_id.replaceAll("[.]$", "");
        if(new_id.length() < 1) {
            return "aaa";
        }
        if(new_id.length() < 3) {
            for(int i=new_id.length(); i<3; i++) {
                new_id += String.valueOf(new_id.charAt(new_id.length()-1));
            }
        }
        return new_id;
    }
}