class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        
        //이용한 만큼 반복하면서 이용료*n배를 answer에 더함. 
        for(int i=1; i<=count; i++){
            answer+=price*i;    
        }
        
        //n번 이용하고 계산된 이용료인 answer에서  
        //자신이 가지고 있는 돈(money)뺀 값이 0보다 크다면
        //answer에 부족한 금액이 얼마인지 알아내기 위해 
        //answer-=money
        //금액이 부족하지 않다면 0
        if(answer-money>0){
        answer-=money;
        }else{
            answer=0;
        }
        
        return answer;
    }
}