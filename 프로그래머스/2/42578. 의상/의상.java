import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer=1;
        //HashMap 선언
        HashMap<String, Integer> map = new HashMap<String,Integer>();
      
        //문제 제한사항에 같은 이름을 가진 의상은 존재하지 않는다. 
        //의상 종류 개수만 세면 된다. 
        //해시맵에 데이터를 추가하는데 종류는 키 값이 된다.
        //만약 존재할 경우 해당하는 키 값에 +1
        //존재하지 않는 경우 0을 반환한 후 +1
        //getOrDefault(key,null일 경우 반환하는 값)
        for(String[] cloth:clothes){
           map.put(cloth[1],map.getOrDefault(cloth[1],0)+1);
        }
        
        //answer에 모든 키의 값을 곱한다.
        //키 값마다 1을 더하고 곱하는 이유는 해당 종류에서 아무것도 선택하지 않는 경우.
        for(String str: map.keySet()){
            answer*=map.get(str)+1;
        }
        
        //아무 것도 입지 않는 경우를 제외하기 위해 -1
        return answer-1;
    }
}