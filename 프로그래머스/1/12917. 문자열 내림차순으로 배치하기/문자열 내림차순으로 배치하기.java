import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        char[] list = s.toCharArray(); //문자열 s를 char[] 배열로 바꾸기
        
        Arrays.sort(list); 
        //오름차순 정렬
        //[Z, b, c, d, e, f, g]
    
        for(char i:list){
            sb.append(i);
        }
        
        //오름차순 정렬한 걸 reverse()메서드로 거꾸로 
        // [Z, b, c, d, e, f, g]
        // [g, f, e, d, c, b, Z] 
        return sb.reverse().toString();      
    }
}