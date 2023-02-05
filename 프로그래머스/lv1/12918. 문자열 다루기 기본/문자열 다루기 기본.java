import java.util.regex.Pattern;

class Solution {
    public boolean solution(String s) {
           	boolean answer = false;
        s=s.toLowerCase();
        if(s.length()==4||s.length()==6){
            if(Pattern.matches("^[0-9]*$",s)) {
            	answer=true;
            }        
    }
        return answer;
    }
}