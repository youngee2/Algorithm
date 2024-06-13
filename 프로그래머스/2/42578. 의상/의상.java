import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer=1;
        
        HashMap<String, Integer> clothes_hash= new HashMap<String, Integer>();
        
        //HashMap에 만약 같은 종류가 있다면 value +1 다르다면 1
        for(int i=0; i<clothes.length; i++){
            if(clothes_hash.containsKey(clothes[i][1])){
                clothes_hash.put(clothes[i][1], clothes_hash.get(clothes[i][1])+1);
            }else{
                clothes_hash.put(clothes[i][1], 1);
            }
        }
        // 해당 옷을 안입을수도 있기 때문에 +1
        // (1번 종류 수+1)(2번 종류 수+1) ... (n번 종류 수+1) - 1
        
        for (int count : clothes_hash.values()) {
            answer *= count+1;
        }
       
        
        return answer-1;
    }
}