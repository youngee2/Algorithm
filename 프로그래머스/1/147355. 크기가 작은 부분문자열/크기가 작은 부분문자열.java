import java.util.*;
class Solution {
    public int solution(String t, String p) {

       int l=t.length();
       int answer=0;
      
        for(int i=0; i<=l-p.length(); i++){
           if(Long.parseLong(p)>=Long.parseLong(t.substring(i,i+p.length()))){
               answer++;
           }            
        }
        
        
        return answer;
    }
}