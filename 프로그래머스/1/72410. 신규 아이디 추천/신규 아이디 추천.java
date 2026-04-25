class Solution {
    public String solution(String new_id) {
        new_id = new_id.toLowerCase();
        new_id = new_id.replaceAll("[^[a-z0-9-_.]]", "");
        new_id = new_id.replaceAll("[.]{2,}", ".");
        new_id = new_id.replaceAll("^\\.|\\.$", "");
        new_id = new_id.replaceAll("^$", "a");
        if(new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
        }
        if(new_id.endsWith(".")) {
            new_id = new_id.substring(0, new_id.length()-1);
        }
        if(new_id.length() <= 2) {
            for(int i=new_id.length(); i<3; i++) {
                new_id += new_id.charAt(new_id.length()-1);
            }
        }
        return new_id;
    }
}