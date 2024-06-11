import java.util.*;
//participant에서 completion이 있는지 체크
class Solution {
    public String solution(String[] participant, String[] completion) {
        //결과를 저장할 변수
        String answer=""; 
        
        //hashMap 생성
        HashMap<String,Integer> list = new HashMap<>();
       
        //HashMap에 참가자 리스트 추가. 동명이인이 있을 경우 +1 증가
        for(int i=0; i<participant.length; i++){
            if(list.containsKey(participant[i])){
                list.put(participant[i], list.get(participant[i])+1);
            }else{
                list.put(participant[i],1);
            }
        }
        
        
        // 참가자 리스트와 완주자 리스트를 비교. 같은 키 값이 있으면 value값 -1 감소.
        
        for(String x: completion){
            list.put(x, list.get(x)-1);
        }
        
       
        // 참가자 중 0이 아닌 사람을 리턴. 
        // 전에 같은 이름의 완주자가 있으면 -1 감소했기 때문에 완주자는 0이 나옴. 
        //완주자는 0이 아닌 수.
       for(String x:list.keySet()){ 
           if (list.get(x)!=0){
                answer=x;
            }         
       }
        
        return answer;
    }
}
      