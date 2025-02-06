import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(int i=0; i<babbling.length; i++) {
            String str = babbling[i];
            int count = 0;
            for(int j=0; j<str.length()-1; j++) {
                if(str.charAt(j) == 'a' || str.charAt(j) == 'w') {
                    if(str.length() - j < 3) {
                        break;
                    }
                }
                if(str.charAt(j) == 'a' && str.length() - j >= 3) {
                    if(str.charAt(j+1) == 'y' && str.charAt(j+2) == 'a') {
                        j+=2;
                        count +=3;
                    } else {
                        break;
                    }
                } else if(str.charAt(j) == 'y' && str.length() - j >= 2) {
                    if(str.charAt(j+1) == 'e') {
                        j+=1;
                        count += 2;
                    } else {
                        break;
                    }
                }  else if(str.charAt(j) == 'w' && str.length() - j >= 3) {
                    if(str.charAt(j+1) == 'o' && str.charAt(j+2) == 'o') {
                        j+=2;
                        count +=3;
                    } else {
                        break;
                    }

                }  else if(str.charAt(j) == 'm' && str.length() - j >= 2) {
                    if(str.charAt(j+1) == 'a') {
                        j+=1;
                        count += 2;
                    } else {
                        break;
                    }
                }
            }
            if(count == str.length()) {
                answer ++;
            }
        }
        return answer;
    }
}