import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String,Integer> list = new HashMap<String, Integer>();
        
        for(int i=0; i<phone_book.length; i++){
            list.put(phone_book[i],i);
        }
        
        for(int i=0; i<phone_book.length; i++){
            for(int j=0; j<phone_book[i].length(); j++){
            if(list.containsKey(phone_book[i].substring(0,j))){
                return false;
                }
            }
        }
        return answer;
    }
}