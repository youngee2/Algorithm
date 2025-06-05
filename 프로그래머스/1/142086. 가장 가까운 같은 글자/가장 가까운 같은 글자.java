import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character, Integer> list = new HashMap<>();
        
        for(int i=0; i<answer.length; i++){
            char n=s.charAt(i);
        
            if(list.containsKey(n)){
                answer[i]=i-list.get(n);
            }else{
                answer[i]=-1;
            }
            
            list.put(n,i);
        }
        return answer;
    }
}